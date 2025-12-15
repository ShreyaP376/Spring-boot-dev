package com.example.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.entity.Batch;

@Repository
public interface BatchRepo extends JpaRepository<Batch, Integer> {

}
