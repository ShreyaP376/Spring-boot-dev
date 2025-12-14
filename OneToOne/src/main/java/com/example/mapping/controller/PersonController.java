package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Person;
import com.example.mapping.repo.PersonRepo;

@RestController
public class PersonController {

	@Autowired
	PersonRepo personRepo;

	@PostMapping("person")
	public String savePerson(@RequestBody Person p) {
		personRepo.save(p);
		return "Person saved";
	}

	
	@DeleteMapping("person/{id}")
	public String delPerson(@PathVariable int id) {
		Person p = personRepo.findById(id).get();
		personRepo.delete(p);
		return "Person deleted";
	}
}
