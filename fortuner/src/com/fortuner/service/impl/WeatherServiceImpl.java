package com.fortuner.service.impl;

import javax.sound.midi.SysexMessage;

import com.fortuner.app.repo.WeatherDTO;
import com.fortuner.app.repo.WeatherRepository;
import com.fortuner.service.WeatherService;

public class WeatherServiceImpl implements WeatherService {

	private WeatherRepository repo;
	
	public WeatherServiceImpl(WeatherRepository repo) {
		this.repo=repo;
	}
	
	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("running validate and save in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("Dto is valid, can save..");
			String name=dto.getName();
			int totalMonths=dto.getTotalMonths();
			String rainyMonth=dto.getRainyMonth();
			String heavyRainyMonth=dto.getHeavyRainPlace();
			String lowerRainyMonth=dto.getLowerRainPlace();
			if(name!=null)
			{
				System.out.println("Name is valid , can save..");
			}
			else
			{
				System.err.println("name is invalid cannot be save");
			}
			if(totalMonths !=0)
			{
				System.out.println("total months is rainy season is valid");
			}
			else {
				System.err.println("total months is rainy season is valid");
			}
			if(heavyRainyMonth !=null)
			{
				System.out.println("heavy rainy month is valid");
			}
			else {
				System.err.println("heavy rainy months is rainy season is invalid");
			}
			if(lowerRainyMonth !=null)
			{
				System.out.println("lower rainy month in place is valid");
			}
			else {
				System.err.println("lower rainy month is place is invalid");
			}
			this.repo.save(dto);
			return true;
		}
		else
		{
			System.err.println("Dto is invalid , cannot save..");
		}
		
		return false;
	}
	



}
