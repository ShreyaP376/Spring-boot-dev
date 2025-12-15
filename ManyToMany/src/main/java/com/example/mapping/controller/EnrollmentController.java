package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.service.EnrollmentService;

@RestController
public class EnrollmentController {
	@Autowired
	EnrollmentService enrollService;
	
	@PostMapping("enroll/{sId}/{bId}")
	public String enroll(@PathVariable int sId, @PathVariable int bId)
	{
		enrollService.enroll(sId, bId);
		return "Student enrolled";
	}
}
