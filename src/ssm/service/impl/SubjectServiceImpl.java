package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ssm.dao.SubjectDao;
import ssm.entity.Subject;
import ssm.service.SubjectService;

@Service("SubjectService")
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SubjectDao subjectDao;

	@Override
	public List<Subject> findSubjects() {
		return subjectDao.findSubjects();
	}

	@Override
	public void addSubject(Subject subject) {
		subjectDao.addSubject(subject);
	}

}
