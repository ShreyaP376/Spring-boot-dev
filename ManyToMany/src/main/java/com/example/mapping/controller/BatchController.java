package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Batch;
import com.example.mapping.service.BatchService;

@RestController
public class BatchController {

	@Autowired
	BatchService batchService;
	
	@PostMapping("batch")
	public String addbatch(@RequestBody Batch batch) {
		batchService.addBatch(batch);
		return "Batch added";
	}
}
