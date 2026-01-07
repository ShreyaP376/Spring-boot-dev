package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ticket;
import com.example.demo.service.TicketBookService;

@RestController
public class TicketController {

	@Autowired
	TicketBookService ticketBookService;
	
	@PostMapping("ticket")
	public ResponseEntity book(@RequestBody Ticket ticket) {
		return ticketBookService.bookTicket(ticket);
	}
	
	@GetMapping("ticket/{tId}")
	public ResponseEntity get(@PathVariable int tId) {
		return ticketBookService.getTicket(tId);
	}
	
}
