package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Ticket;

public interface TicketBookService {

	ResponseEntity bookTicket(Ticket tkt);
	ResponseEntity getTicket(int tId);
}
