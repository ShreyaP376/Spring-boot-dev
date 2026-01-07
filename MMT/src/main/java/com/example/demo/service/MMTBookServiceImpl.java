package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.config.TicketConfig;
import com.example.demo.entity.TicketMmt;

@Service
public class MMTBookServiceImpl implements MMTBookService{

	@Autowired
	RestTemplate restTemplate;

	@Override
	public ResponseEntity callIrctcBooking(TicketMmt ticketmmt) {
		// TODO Auto-generated method stub
		ResponseEntity result = restTemplate.postForEntity("http://localhost:8080/ticket", ticketmmt, String.class);
		return result;
	}

	@Override
	public ResponseEntity getBookingFromIrctc(int tId) {
		ResponseEntity result = restTemplate.getForEntity("http://localhost:8080/ticket/"+tId,TicketMmt.class);
		return result;
	}

	
}
