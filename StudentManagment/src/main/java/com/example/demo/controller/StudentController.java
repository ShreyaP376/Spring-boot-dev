package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService schoolServiceImpl;
	
	@Autowired
	StudentService collegeServiceImpl;
	
	@GetMapping("fees/{type}")
	public String getFees(@PathVariable String type) {
		if(type.equals("school"))
			return schoolServiceImpl.getFees();
		
		if(type.equals("college"))
			return collegeServiceImpl.getFees();
		
		return null;
	}
}
