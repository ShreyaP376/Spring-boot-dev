package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.IxigoTicket;
import com.example.demo.service.IxigoBookingService;

@RestController
public class IxigoTicketController {

	@Autowired
	IxigoBookingService ixigoBookingService;
	
	@PostMapping("ticket")
	public String bookTicket(@RequestBody IxigoTicket ticket) {
		return ixigoBookingService.callIrctcToBook(ticket);
	}
	
	@GetMapping("ticket/{tId}")
	public ResponseEntity<IxigoTicket> getTicket(@PathVariable int tId) {
		return ixigoBookingService.getFromIrctc(tId);
	}
}
