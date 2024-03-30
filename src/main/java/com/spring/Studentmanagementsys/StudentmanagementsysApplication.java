package com.spring.Studentmanagementsys;

import com.spring.Studentmanagementsys.entity.Student;
import com.spring.Studentmanagementsys.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementsysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsysApplication.class, args);
	}
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
//		Student student=new Student("Vaibhav","mittal","mm@gn.com");
//		Student student2=new Student("Vaav","mittal","nm@gn.com");
//		Student student3=new Student("Baav","mittal","m@gn.com");
//		studentRepo.save(student);
//		studentRepo.save(student2);
//		studentRepo.save(student3);


	}
}
