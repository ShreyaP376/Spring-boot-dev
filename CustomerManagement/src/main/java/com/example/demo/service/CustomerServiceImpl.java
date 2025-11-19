package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepo cr;

	@Override
	public String addCustomer(Customer c) {
		cr.save(c);
		return "Customer added!";
	}

	@Override
	public String deleteCustomer(int cId) {
		cr.deleteById(cId);
		return "Customer with id "+cId+" deleted";
	}

	@Override
	public Customer getCustomer(int cId) {
		Customer c = cr.findById(cId).get();
		return c;
	}

}
