package com.example.demo.scheduler;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.cache.WeatherCache;

@Component
@EnableScheduling
public class CacheWeather {

	@Autowired
	WeatherCache cache;
	
	@Scheduled(fixedDelay = 5,timeUnit = TimeUnit.SECONDS)
	public void run() {
		cache.clear();
		cache.getDataFromDB();
		System.out.println("Cache cleared!");
	}
}
