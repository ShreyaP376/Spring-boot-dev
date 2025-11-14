package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employees;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo er;
	
	@Override
	public void saveEmployee(employees emp) {
		// TODO Auto-generated method stub
		er.save(emp);
	}

}
