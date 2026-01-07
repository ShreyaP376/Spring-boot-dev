package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.IxigoTicket;

@FeignClient(name = "IRCTC", url = "http://localhost:8080")
public interface IrctcFeignClient {

	@PostMapping("/ticket")
	String bookTicket(@RequestBody IxigoTicket ticket);
	
	@GetMapping("/ticket/{tId}")
	ResponseEntity<IxigoTicket> getTicket(@PathVariable("tId") int tId);
}