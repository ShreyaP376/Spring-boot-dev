package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Batch;
import com.example.mapping.repo.BatchRepo;

@Service
public class BatchServiceImpl implements BatchService{

	@Autowired 
	BatchRepo batchRepo;
	@Override
	public void addBatch(Batch batch) {
		batchRepo.save(batch);
	}

}
