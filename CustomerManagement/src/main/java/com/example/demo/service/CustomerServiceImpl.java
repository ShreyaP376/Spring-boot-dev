package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
		//Optional<Customer> cust = cr.findById(cId);
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

	@Override
	public String updateCustSpecific(int cId, Customer c) {
		Customer old = cr.findById(cId).get();
		if(old == null)
			return "Customer not found";
		
		if(c.getName() != null) {
			old.setName(c.getName());
		}
		
		if(c.getEmail() != null) {
			old.setEmail(c.getEmail());
		}
		
		if(c.getAddress() != null) {
			old.setAddress(c.getAddress());
		}
		
		if(c.getAge() != 0) {
			old.setAge(c.getAge());
		}
		
		cr.save(old);
		return cId+" updated using patch method";
	}

}
