package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.employees;

public interface EmployeeRepo extends JpaRepository<employees, Integer>{

}
