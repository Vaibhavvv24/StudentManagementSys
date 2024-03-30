package com.spring.Studentmanagementsys.controller;

import com.spring.Studentmanagementsys.entity.Student;
import com.spring.Studentmanagementsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentCont {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getAll(Model model){
        model.addAttribute("students",studentService.getAll());
        return "students";
    }
    @GetMapping("/students/add")
    public String addStudent(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "create_student";

    }
    @PostMapping("/students/save")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/students/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable int id,@ModelAttribute("student") Student student,Model model){
        Student existingstudent=studentService.getStudentById(id);
        existingstudent.setFirstName(student.getFirstName());
        existingstudent.setLastName(student.getLastName());
        existingstudent.setEmail(student.getEmail());
        studentService.updateStudent(existingstudent);
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
