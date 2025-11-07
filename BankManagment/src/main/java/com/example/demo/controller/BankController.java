package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Factory.Factory;
import com.example.demo.service.BankService;

@RestController
public class BankController {

	@GetMapping("bank/{type}")
	public String getInfo(@PathVariable String type) {
		BankService bs = Factory.getObj(type);
		return bs.getInfo();
	}
}
