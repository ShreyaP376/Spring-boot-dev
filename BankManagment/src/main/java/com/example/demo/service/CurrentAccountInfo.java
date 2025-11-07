package com.example.demo.service;

public class CurrentAccountInfo extends BankServiceAB{

	@Override
	public void processInfo() {
		System.out.println("Processing data from DB");
		
	}

	@Override
	public String printInfo() {
		System.out.println("Print current account info");
		return "Current account info";
	}

}
