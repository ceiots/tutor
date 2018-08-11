package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import ssm.dao.ChatRecordDao;
import ssm.entity.ChatRecord;
import ssm.service.ChatRecordService;

@Service("ChatRecordService")
public class ChaterRecordServiceImpl implements ChatRecordService {

    @Resource
    private ChatRecordDao chatRecordDao;

	@Override
	public List<ChatRecord> findChatRecords() {
		return chatRecordDao.findChatRecords();
	}

	@Override
	public void addChatRecord(ChatRecord chatRecord) {
		chatRecordDao.addChatRecord(chatRecord);
	}

}
