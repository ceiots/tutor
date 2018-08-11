package ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import ssm.dao.MessageDao;
import ssm.entity.Message;
import ssm.service.MessageService;

@Service("MessageService")
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageDao messageDao;

	/*@Override
	public void saveMsg(String userId, String toUserId, String msgText) {
		messageDao.saveMsg(userId,toUserId,msgText);
	}*/
	
	@Override
	public void saveMsg(Message message) {
		messageDao.saveMsg(message);
	}
	
	@Override
	public List<Message> findSaveMsg(String userId,String toUserId) {
		return messageDao.findSaveMsg(userId,toUserId);
	}
	
}
