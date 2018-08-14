package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import ssm.dao.PersonalCenterDao;
import ssm.entity.PersonalCenter;
import ssm.service.PersonalCenterService;

@Service("PersonalCenterService")
public class PersonalCenterServiceImpl implements PersonalCenterService {

    @Resource
    private PersonalCenterDao personalCenterDao;

	@Override
	public List<PersonalCenter> findPersonalCenters() {
		return personalCenterDao.findPersonalCenters();
	}

	/*@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}*/

}
