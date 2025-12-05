package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService ws;
	
	@GetMapping("weather/{id}")
	public Weather getWeather(@PathVariable int id) {
		return ws.getWeather(id);
	}
	
	@PostMapping("weather")
	public String addWeather(@RequestBody Weather w) {
		return ws.addWeather(w);	
	}
}
