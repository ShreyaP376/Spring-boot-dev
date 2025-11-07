package com.example.demo.service;

public abstract class BankServiceAB implements BankService{

	@Override
	public void readInfofromDB() {
		System.out.println("Reading data from DB");
		
	}

	@Override
	public String getInfo() {
		readInfofromDB();
		processInfo();
		return printInfo();
	}

}
