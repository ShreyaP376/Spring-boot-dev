package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public void addStudent(student s) {
		if(s.getName().equals("")) {
			throw new RuntimeException();
		}
		studentRepository.save(s);
	}
	
	public student getStudent(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
}
