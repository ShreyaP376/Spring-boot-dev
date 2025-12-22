package com.example.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public boolean existsByName(String name);
}
