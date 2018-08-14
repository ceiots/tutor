package ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import ssm.entity.Grades;

@Repository
public interface GradesDao {

    public List<Grades> findGrades();
   // public Subject addSubject(Grades grades);
}
