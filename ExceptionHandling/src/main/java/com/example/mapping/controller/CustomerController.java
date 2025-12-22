package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Customer;
import com.example.mapping.exception.CustomerServiceException;
import com.example.mapping.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService cs;

	@PostMapping("customer")
	public ResponseEntity saveCustomer(@RequestBody Customer c) {
		cs.saveCustomer(c);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("customer/{id}")
	public ResponseEntity getCustomer(@PathVariable int id) {
		return new ResponseEntity(cs.getCustomer(id),HttpStatus.OK);
	}
}
