package com.example.mapping.exception;

import org.springframework.http.HttpStatus;

public class CustomerServiceException extends RuntimeException{
	private String msg;
	private HttpStatus status;
	public CustomerServiceException(String msg, HttpStatus status) {
		this.msg = msg;
		this.status = status;
	}
	
	public String errorMsg() {
		return msg;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	

}
