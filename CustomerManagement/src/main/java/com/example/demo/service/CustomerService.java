package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {

	public String addCustomer(Customer c);
	public String deleteCustomer(int cId);
	public Customer getCustomer(int cId);
	List<Customer> getAllCustomer();
	String updatedCustomer(int cId, Customer c);
}
