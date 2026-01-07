package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TicketMmt;
import com.example.demo.service.MMTBookService;

@RestController
public class TicketMmtController {

	@Autowired
	MMTBookService mmtBookService;
	
	@GetMapping("ticket/{tId}")
	public ResponseEntity getTrctc(@PathVariable int tId) {
	return mmtBookService.getBookingFromIrctc(tId);
	}
	
	@PostMapping("ticket")
	public ResponseEntity callIrctc(@RequestBody TicketMmt ticket) {
		return mmtBookService.callIrctcBooking(ticket);
	}
	
}
