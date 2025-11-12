package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.CollegeServiceImpl;
import com.example.demo.service.PhdServiceImpl;
import com.example.demo.service.SchoolServiceImpl;

@RestController
public class StudentController {

	private SchoolServiceImpl schoolServiceImpl;
	private CollegeServiceImpl collegeServieImpl;
	
	//field injection
	@Autowired(required = false)
	PhdServiceImpl phdServiceImpl;
	
	@Autowired(required = false) //setter injection
	public void setStudentService(@Qualifier("schoolServiceImpl") SchoolServiceImpl schoolServiceImpl) {
		this.schoolServiceImpl = schoolServiceImpl;
	}

	//constructor injection
	 StudentController(@Qualifier("collegeServiceImpl") CollegeServiceImpl collegeServieImpl) {
		this.collegeServieImpl = collegeServieImpl; 
	}
	
	@GetMapping("fees/{type}")
	public String getFees(@PathVariable String type) {
		
		if(type.equals("school"))
			return schoolServiceImpl.getFees();
		
		if(type.equals("college"))
			return collegeServieImpl.getFees();
		
		if(type.equals("phd"))
			return phdServiceImpl.getFees();
					
		return null;
	}
}
