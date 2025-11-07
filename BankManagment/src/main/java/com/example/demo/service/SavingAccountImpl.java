package com.example.demo.service;

public class SavingAccountImpl extends BankServiceAB{

	@Override
	public void processInfo() {
		System.out.println("Processing data");
		
	}

	@Override
	public String printInfo() {
		System.out.println("Print data from Saving account");
		return "Saving account Info";
	}

}
