package com.students_management.students_management_app.service;

import java.util.List;
import com.students_management.students_management_app.entity.Student;


public interface StudentService {
    
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
