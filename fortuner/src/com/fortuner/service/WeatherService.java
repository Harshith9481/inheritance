package com.fortuner.service;

import com.fortuner.app.repo.WeatherDTO;

public interface WeatherService {
	
	
	boolean validateAndSave(WeatherDTO dto);

}
