package com.example.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
