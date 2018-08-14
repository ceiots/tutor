package ssm.service;

import java.util.List;
import ssm.entity.Subject;

public interface SubjectService {

    public List<Subject> findSubjects();
    
    public void addSubject(Subject subject);
}
