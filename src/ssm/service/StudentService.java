package ssm.service;

import java.util.List;

import ssm.entity.Student;

public interface StudentService {

    public List<Student> findStudents();
    
    public void addStudent(Student student);
}
