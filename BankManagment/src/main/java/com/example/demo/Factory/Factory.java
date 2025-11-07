package com.example.demo.Factory;

import com.example.demo.service.BankService;
import com.example.demo.service.CurrentAccountInfo;
import com.example.demo.service.SavingAccountImpl;

public class Factory {

	public static BankService getObj(String type) {
		if(type.equals("saving")) {
			return new SavingAccountImpl();
		}
		if(type.equals("current")) {
			return new CurrentAccountInfo();
		}
		return null;
	}
}
