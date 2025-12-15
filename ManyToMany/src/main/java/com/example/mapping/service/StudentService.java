package com.example.mapping.service;

import com.example.mapping.entity.Student;

public interface StudentService {
	void addStudent(Student student);
	Student getStudent(int sId);
}
