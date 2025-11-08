package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;

@Service
public class CreditCardPaymentImpl extends PaymentServiceAB{

	@Override
	public void initiateTransaction(Payment payment) {
		System.out.println("Initiating credit card payment");		
	}

	@Override
	public boolean checkBalance(Payment p) {
		if(p.getAmount()< 100) {
			System.out.println("Insufficient balance");
			return false;
		}
		return true;
	}
	
	@Override
	public double getBalance() {
		return 450000;
	}

}
