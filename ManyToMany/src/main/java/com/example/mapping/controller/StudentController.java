package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Student;
import com.example.mapping.repo.StudentRepo;
import com.example.mapping.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("student")
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "Student added";
	}
	
	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
}
