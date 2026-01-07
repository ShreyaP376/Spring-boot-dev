package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IxigoTicket {
	
	@Id
	private int tId;
	private String source;
	private String destination;
	private LocalDateTime bookedAt;
	private int prn;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getBookedAt() {
		return bookedAt;
	}
	public void setBookedAt(LocalDateTime bookedAt) {
		this.bookedAt = bookedAt;
	}
	public int getPrn() {
		return prn;
	}
	public void setPrn(int prn) {
		this.prn = prn;
	}
	
	
}
