package com.spring.Studentmanagementsys.service;

import com.spring.Studentmanagementsys.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAll();

    Student saveStudent(Student student);

    Student updateStudent(Student student);
    Student getStudentById(int id);

    void deleteStudentById(int id);
}
