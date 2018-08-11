package ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ssm.entity.Message;

@Repository
public interface MessageDao {

    /*public void saveMsg(@Param("userId")String userId,@Param("toUserId")String toUserId,@Param("msgText")String msgText);*/
    
    public void saveMsg(Message message);
    public List<Message> findSaveMsg(@Param("userId")String userId,@Param("toUserId")String toUserId);
    
}
