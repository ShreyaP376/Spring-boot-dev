package com.example.demo.service;

import java.util.List;

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
		return c.getName()+" added!";
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

	@Override
	public List<Customer> getAllCustomer() {
		return cr.findAll();
	}

	@Override
	public String updatedCustomer(int cId, Customer c) {
		Customer old = cr.findById(cId).get();
		if(old == null)
			return "Customer not found";
		
		old.setName(c.getName());
		old.setAddress(c.getAddress());
		old.setAge(c.getAge());
		old.setEmail(c.getEmail());
		cr.save(old);
		return cId+" updated!";
	}

}
