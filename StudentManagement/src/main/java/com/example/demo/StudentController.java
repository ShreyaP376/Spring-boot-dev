package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@PostMapping("student/addInfo")
	String addInfo(@RequestBody Student s) {
		return "Added data successfully for stuent " + s.getName();
	}
}
