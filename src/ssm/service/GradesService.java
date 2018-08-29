package ssm.service;

import java.util.List;

import ssm.entity.Grades;
import ssm.pojo.GradesPojo;

public interface GradesService {

    public List<Grades> findGrades();
    
   /* public void addSubject(Subject subject);*/
}
