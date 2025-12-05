package com.example.demo.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Weather;
import com.example.demo.repo.WeatherRepo;

import jakarta.annotation.PostConstruct;

@Component
public class WeatherCache {

	@Autowired
	WeatherRepo repo;
	
	Map<Integer, Weather> mp = new HashMap();
	
	public void getDataFromDB() {
		List<Weather> data = repo.findAll();
		System.out.println("Reading data from DB");
		for(Weather w : data) {
			mp.put(w.getId(), w);
		}
	}
	
	public void storeData(Weather w) {
		mp.put(w.getId(), w);
	}
	
	public Weather getData(int id) {
		if(mp.containsKey(id)) {
			return mp.get(id);
		}
		return null;
	}
	
	public boolean checkData(int id) {
		return mp.containsKey(id);
	}
	
	public void clear() {
		mp.clear();
	}
}
