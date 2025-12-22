package com.example.mapping.globalException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.mapping.exception.CustomerServiceException;

@Component
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity handleCustomerServiceExp(CustomerServiceException e) {
		return new ResponseEntity(e.getMessage(), e.getStatus());
	}

}
