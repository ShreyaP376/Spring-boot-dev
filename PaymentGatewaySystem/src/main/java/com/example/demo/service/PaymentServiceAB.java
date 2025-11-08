package com.example.demo.service;

import com.example.demo.entity.Payment;

public abstract class PaymentServiceAB implements PaymentService{

	@Override
	public void validate(Payment p) {
		System.out.println("Validation successfull for "+p.getUserId());	
	}

	@Override
	public void confirmPayment(Payment p) {

		if(!checkBalance(p)) {
			System.out.println("Payment failed!");
			return;
		}
			
		System.out.println("Payment Successfull! Transcation Id is: "+p.getPaymentId());	
		
	}

	@Override
	public void processPayment(Payment p) {
		validate(p);
		initiateTransaction(p);
		confirmPayment(p);
	}
}
