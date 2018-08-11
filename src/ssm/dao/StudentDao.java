package ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import ssm.entity.Student;

@Repository
public interface StudentDao {

    public List<Student> findStudents();
    public Student addStudent(Student student);
}
