package com.students_management.students_management_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students_management.students_management_app.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
