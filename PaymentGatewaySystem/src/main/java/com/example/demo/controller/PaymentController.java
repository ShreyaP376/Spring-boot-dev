package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	ApplicationContext factory;
	
	@PostMapping("makePayment")
	public void makePayment(@RequestBody Payment p) {
		PaymentService ps = (PaymentService)factory.getBean(p.getPaymentType());
		ps.processPayment(p);
	}
	
	@GetMapping("getBalance/{type}")
	public double getBal(@PathVariable String type) {
		PaymentService ps = (PaymentService)factory.getBean(type);
		return ps.getBalance();
	}
}
