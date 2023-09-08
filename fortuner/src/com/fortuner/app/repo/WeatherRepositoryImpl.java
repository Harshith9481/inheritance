package com.fortuner.app.repo;

public class WeatherRepositoryImpl implements WeatherRepository {

	private WeatherDTO[] rain = new WeatherDTO[TOTAL_MONTHS];
	private int position;
	@Override
	public void save(WeatherDTO dto) {
		System.out.println("running dto in "+this.getClass().getSimpleName());
		if(position<TOTAL_MONTHS)
		{
				this.rain[position]=dto;
				System.out.println(dto+"Dto can be save..");
				this.position++;
		}
		else
		{
			System.err.println("dto cannot be save..");
		}
	}
	
	
	
	

}
