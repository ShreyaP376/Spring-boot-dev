package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.repo.BatchRepo;
import com.example.mapping.repo.StudentRepo;
import com.example.mapping.entity.Batch;
import com.example.mapping.entity.Student;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	BatchRepo batchRepo;

	@Override
	public void enroll(int sId, int bId) {
		Student s = studentRepo.findById(sId).get();
		Batch b = batchRepo.findById(bId).get();
		
		b.getStudents().add(s);
		batchRepo.save(b);
		
	}
	
	
}
