package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student/{id}")
	public ResponseEntity getStudent(@PathVariable int id){
		return new ResponseEntity(studentService.getStudent(id), HttpStatus.OK);
	}
	
	@PostMapping("/student")
	public ResponseEntity addStudent(@RequestBody student s) {
		studentService.addStudent(s);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
