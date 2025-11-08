package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements StudentService{

	@Override
	public String getFees() {
		// TODO Auto-generated method stub
		return "School fees is 20k";
	}

}
