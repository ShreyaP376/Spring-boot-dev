package com.example.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{

}
