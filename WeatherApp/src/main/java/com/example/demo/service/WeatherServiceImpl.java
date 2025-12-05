package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cache.WeatherCache;
import com.example.demo.entity.Weather;
import com.example.demo.repo.WeatherRepo;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	@Autowired
	WeatherRepo weatherRepo;
	
	@Autowired
	WeatherCache cache;
	
	@Override
	public Weather getWeather(int id) {
		if(cache.checkData(id)) {
			System.out.println("Reading data from cache");
			return cache.getData(id);
		}
		System.out.println("Reading data from DB");
		Weather w = weatherRepo.findById(id).get();
		cache.storeData(w);
		return w;
	}

	@Override
	public String addWeather(Weather w) {
		weatherRepo.save(w);
		return "Weather added!";
	}

}
