package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.IxigoTicket;

@Service
public class IxigoBookingServiceImpl implements IxigoBookingService{

	@Autowired
	IrctcFeignClient irctcFeignClient;
	
	@Override
	public String callIrctcToBook(IxigoTicket ticket) {
		// TODO Auto-generated method stub
		
		return irctcFeignClient.bookTicket(ticket);
	}

	@Override
	public ResponseEntity<IxigoTicket> getFromIrctc(int tId) {
		return irctcFeignClient.getTicket(tId);
	}

	
}
