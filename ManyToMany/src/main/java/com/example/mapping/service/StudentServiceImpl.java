package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Student;
import com.example.mapping.repo.BatchRepo;
import com.example.mapping.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;

	@Override
	public void addStudent(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public Student getStudent(int sId) {
		
		return studentRepo.findById(sId).get();
	}
	
	
}
