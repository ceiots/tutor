package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ssm.dao.StudentDao;
import ssm.entity.Student;
import ssm.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

	@Override
	public List<Student> findStudents() {
		return studentDao.findStudents();
	}

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

}
