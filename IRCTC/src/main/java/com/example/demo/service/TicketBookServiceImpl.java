package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ticket;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketBookServiceImpl implements TicketBookService{

	@Autowired
	TicketRepository ticketRepository;

	@Override
	public ResponseEntity bookTicket(Ticket tkt) {
		ticketRepository.save(tkt);
		return new ResponseEntity("Ticket is booked and the ticket id is "+tkt.gettId(),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity getTicket(int tId) {
		// TODO Auto-generated method stub
		Ticket ticket = ticketRepository.findById(tId).get();
		System.out.println(ticket);
		return new ResponseEntity(ticket,HttpStatus.OK);
	}
	
	
}
