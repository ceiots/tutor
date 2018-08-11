package ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ssm.dao.UploadDao;
import ssm.entity.Upload;
import ssm.service.UploadService;

@Service("UploadService")
public class UploadServiceImpl implements UploadService {

    @Resource
    private UploadDao uploadDao;

	@Override
	public int uploadPhoto(String userId, byte[] photo1) {
		return uploadDao.uploadPhoto(userId,photo1);
	}
	@Override
	public int uploadVideo(String userId, byte[] video1) {
		return uploadDao.uploadVideo(userId,video1);
	}
	@Override
	public List<Upload> findUpload(){
		return uploadDao.findUpload();
	};
}
