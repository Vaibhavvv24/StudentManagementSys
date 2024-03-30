package com.spring.Studentmanagementsys.service;

import com.spring.Studentmanagementsys.entity.Student;
import com.spring.Studentmanagementsys.repository.StudentRepo;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
         Optional<Student> returned=studentRepo.findById(id);
         if(returned.isPresent()){
             return returned.get();
         }
         throw new RuntimeException("No student found");
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }

}
