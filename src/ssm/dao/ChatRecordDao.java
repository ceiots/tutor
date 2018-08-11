package ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import ssm.entity.ChatRecord;

@Repository
public interface ChatRecordDao {

    public List<ChatRecord> findChatRecords();
    public ChatRecord addChatRecord(ChatRecord chatRecord);
}
