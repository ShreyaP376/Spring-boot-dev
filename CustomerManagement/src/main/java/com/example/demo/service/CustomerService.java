package com.example.demo.service;

import com.example.demo.entity.Customer;

public interface CustomerService {

	public String addCustomer(Customer c);
	public String deleteCustomer(int cId);
	public Customer getCustomer(int cId);
}
