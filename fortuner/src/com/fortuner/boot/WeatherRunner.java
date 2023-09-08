package com.fortuner.boot;

import com.fortuner.app.repo.WeatherDTO;
import com.fortuner.app.repo.WeatherRepository;
import com.fortuner.app.repo.WeatherRepositoryImpl;
import com.fortuner.service.WeatherService;
import com.fortuner.service.impl.WeatherServiceImpl;

public class WeatherRunner {
	
	public static void main(String[] args) {
		
	
	
	WeatherRepository weather = new WeatherRepositoryImpl();
	
	WeatherService season = new WeatherServiceImpl(weather);
	
	WeatherDTO dto = new WeatherDTO("Rainy season",4,"aug","agumbe","Haveri");
	 season.validateAndSave(dto);
	}
	
	
	

}
