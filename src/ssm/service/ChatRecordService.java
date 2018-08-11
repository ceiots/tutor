package ssm.service;

import java.util.List;

import ssm.entity.ChatRecord;

public interface ChatRecordService {

    public void addChatRecord(ChatRecord chatRecord);
    
    public List<ChatRecord> findChatRecords();
}
