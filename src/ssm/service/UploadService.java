package ssm.service;

import java.util.List;

import ssm.entity.Upload;

public interface UploadService {

    public int uploadPhoto(String userId, byte[] photo1);
    public int uploadVideo(String userId, byte[] video1);
    
    public List<Upload> findUpload();
}
