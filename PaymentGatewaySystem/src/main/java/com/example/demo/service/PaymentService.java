package com.example.demo.service;

import com.example.demo.entity.Payment;

public interface PaymentService {

	void validate(Payment p);
	void initiateTransaction(Payment p);
	boolean checkBalance(Payment p);
	void confirmPayment(Payment p);
	void processPayment(Payment p);
	double getBalance();
}
