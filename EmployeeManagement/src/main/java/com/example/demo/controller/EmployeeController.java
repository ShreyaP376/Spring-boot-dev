package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employees;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@PostMapping("addEmployee")
	public String addEmployee(@RequestBody employees emp) {
		
		es.saveEmployee(emp);
		return "Employee added";
	}
}
