package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	ApplicationContext factory;
	
	@GetMapping("fees/{type}")
	public String getFees(@PathVariable String type) {
		
		StudentService ss = (StudentService)factory.getBean(type);
		return ss.getFees();
	}
}
