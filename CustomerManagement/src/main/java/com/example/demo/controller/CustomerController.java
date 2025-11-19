package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@PostMapping("addCustomer")
	public String addCustomer(@RequestBody Customer c) {
		return cs.addCustomer(c);
	}
	
	@DeleteMapping("delCustomer/{cId}")
	public String delCustomer(@PathVariable int cId) {
		return cs.deleteCustomer(cId);
	}
	
	@GetMapping("getCustomer/{cId}")
	public Customer getCustomer(@PathVariable int cId) {
		return cs.getCustomer(cId);
	}

}
