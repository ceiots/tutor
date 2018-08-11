package ssm.service;

import java.util.List;

import ssm.entity.Message;

public interface MessageService {

    /*public void saveMsg(String userId, String toUserId, String msgText);*/
    
    public void saveMsg(Message message);
    public List<Message> findSaveMsg(String userId,String toUserId);
}
