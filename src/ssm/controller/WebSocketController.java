package ssm.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.web.context.ContextLoader;

import ssm.entity.Message;
import ssm.service.MessageService;



/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 */
@ServerEndpoint("/websocket/{userId}/{toUserId}")
public class WebSocketController {
 /* @Resource
	 private MessageService messageService;*/
	 MessageService messageService = (MessageService)ContextLoader.getCurrentWebApplicationContext().getBean("messageService");
	
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
    private static CopyOnWriteArraySet<WebSocketController> webSocketSet = new CopyOnWriteArraySet<WebSocketController>();

    //若要实现服务端与指定客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
    public static ConcurrentHashMap<String,WebSocketController> userIdThisMap = new ConcurrentHashMap<String,WebSocketController>();
    
    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    private String userId;
    private String toUserId;

    /**
     * 连接建立成功调用的方法
     * @param session  可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(@PathParam("userId") String userId,
    		@PathParam("toUserId") String toUserId, Session session){
        System.out.println("userId="+userId+" ,toUserId="+toUserId);
        this.session = session;
        this.userId = userId;
        this.toUserId = toUserId;
        
        userIdThisMap.put(this.userId,this);    
        addOnlineCount();           //在线数加1
        System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
        List<Message> msgList = messageService.findSaveMsg(this.userId,this.toUserId);
	        for(Message msg : msgList){
	        	try {
	        		if(this.userId.equals(msg.getUserId())){
	        			this.session.getBasicRemote().sendText("发送给 "+msg.getToUserId() +" 的消息："+msg.getMsgText());
	        		}else{
	        			this.session.getBasicRemote().sendText("接收到来自 "+msg.getUserId() +" 的消息："+msg.getMsgText());
	        		}
	        	} catch (IOException e) {
					e.printStackTrace();
				}
	        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(){
        webSocketSet.remove(this);  //从set中删除
        userIdThisMap.remove(this.userId);
        subOnlineCount();           //在线数减1
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     * @param message 客户端发送过来的消息
     * @param session 可选的参数
     */
    @OnMessage
    public void onMessage(String msgText, Session session) {
    	//JSONObject messageJsonObj = JSONObject.fromObject(messageJsonStr);
    	//String msgText = messageJsonObj.get("msgtext");
    	for (WebSocketController item : userIdThisMap.values()) {
    		if (item.userId.equals(this.userId) && item.toUserId.equals(this.toUserId)){
    			//Case 1: userId=userId + toUserId=toUserId
    			System.out.println("发送内容："+" ,this.userId="+this.userId + " ,this.toUserId="+this.toUserId+" 消息:"+msgText);
    			try {
    					item.sendMessage("我发送给"+this.toUserId+" 消息:"+msgText);
				} catch (IOException e) {
					e.printStackTrace();
				}
    		} 
    		if(item.userId.equals(this.toUserId)){
    			//Case 2: userId=toUserId
    			System.out.println("this.userId="+item.userId + " ,msgText=" + msgText);
    			System.out.println("item.session="+item.session);
    			try{
    					item.sendMessage("收到 "+this.userId+" 消息:"+msgText);
    			} catch (Exception e) {
		             e.printStackTrace();
		             continue;
		         }
    		}
		}
    	//save to DB
		MessageService messageService = (MessageService)ContextLoader.getCurrentWebApplicationContext().getBean("messageService");
		//messageService.saveMsg(this.userId,this.toUserId,msgText);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		System.out.println(currentTime);
		Message message = new Message(this.userId,this.toUserId,msgText,"Read",currentTime);
		messageService.saveMsg(message);
		
		//群发消息
      /* for(WebSocketController item: webSocketSet){
            try {
            	System.out.println("befo");
                item.sendMessage(msgText);
                System.out.println("test");
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }*/
    }

    /**
     * 发生错误时调用
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error){
        System.out.println("发生错误");
        error.printStackTrace();
    }

    /**
     * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
     * @param message
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException{
    	this.session.getBasicRemote().sendText(message);
       //this.session.getAsyncRemote().sendText(message);
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketController.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketController.onlineCount--;
    }
    public static void main(String args[]){
    	Date d = new Date();
		System.out.println(d);
    }
}