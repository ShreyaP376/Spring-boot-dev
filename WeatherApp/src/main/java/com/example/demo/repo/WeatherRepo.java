package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Weather;

public interface WeatherRepo extends JpaRepository<Weather, Integer>{

}
