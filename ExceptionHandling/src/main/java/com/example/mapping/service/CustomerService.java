package com.example.mapping.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Customer;
import com.example.mapping.exception.CustomerServiceException;
import com.example.mapping.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo cr;
	
	public void saveCustomer(Customer customer) {
		if(!customer.getAddress().equals("pune")) {
			
			throw new CustomerServiceException("invalid address",HttpStatus.BAD_REQUEST);
		}
		if(cr.existsByName(customer.getName())) {
			throw new CustomerServiceException("customer exists", HttpStatus.CONFLICT);
		}
		cr.save(customer);
		System.out.println("Customer saved");
	}
	
	public Customer getCustomer(int id) {
		 return cr.findById(id)
	                .orElseThrow(() ->
	                        new CustomerServiceException("ID invalid", HttpStatus.BAD_REQUEST)
	                );
		
	}
}
