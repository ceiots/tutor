package ssm.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Message {

	private String userId; // 聊天者
	private String toUserId; // 聊天对象
	private String msgText;
    private String status;//Read / Unread / Failed
    private Timestamp createTime;
	
	public Message() {
		super();
	}

	public Message(String userId, String toUserId, String msgText,String status,Timestamp createTime) {
		super();
		this.userId = userId;
		this.toUserId = toUserId;
		this.msgText = msgText;
		this.status = status;
		this.createTime = createTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getMsgText() {
		return msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "message [userId: " + userId + ", toUserId: " + toUserId + ", msgText: " + msgText + ", status: " + status + ", createTime: " + createTime + "]";
	}
}
