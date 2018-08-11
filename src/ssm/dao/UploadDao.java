package ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ssm.entity.Upload;

@Repository
public interface UploadDao {

    public int uploadPhoto(@Param("userId")String userId, @Param("photo1")byte[] photo1);
    public int uploadVideo(@Param("userId")String userId, @Param("video1")byte[] video1);
    
    public List<Upload> findUpload();
}
