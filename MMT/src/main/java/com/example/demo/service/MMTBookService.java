package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.TicketMmt;

public interface MMTBookService {
	ResponseEntity callIrctcBooking(TicketMmt ticketmmt);
	ResponseEntity getBookingFromIrctc(int tId);
}
