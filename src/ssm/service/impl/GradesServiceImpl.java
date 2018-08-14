package ssm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ssm.dao.GradesDao;
import ssm.entity.Grades;
import ssm.service.GradesService;

@Service("GradesService")
public class GradesServiceImpl implements GradesService {

    @Resource
    private GradesDao gradesDao;

	@Override
	public List<Grades> findGrades() {
		return gradesDao.findGrades();
	}

/*	@Override
	public void addSubject(Subject subject) {
		subjectDao.addSubject(subject);
	}
*/
}
