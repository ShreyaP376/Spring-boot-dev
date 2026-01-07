package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.IxigoTicket;

public interface IxigoBookingService {

	String callIrctcToBook(IxigoTicket ticket);
	ResponseEntity<IxigoTicket> getFromIrctc(int tId);
}
