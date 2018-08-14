package ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import ssm.entity.Subject;

@Repository
public interface SubjectDao {

    public List<Subject> findSubjects();
    public Subject addSubject(Subject subject);
}
