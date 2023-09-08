package com.fortuner.app.repo;

import java.io.Serializable;

public class WeatherDTO implements Serializable{
	
	private String name;
	private int totalMonths;
	private String rainyMonth;
	private String heavyRainPlace;
	private String lowerRainPlace;
	
	public void WeatherDTO()
	{
		
	}

	public WeatherDTO(String name, int totalMonths, String rainyMonth, String heavyRainPlace, String lowerRainPlace) {
		super();
		this.name = name;
		this.totalMonths = totalMonths;
		this.rainyMonth = rainyMonth;
		this.heavyRainPlace = heavyRainPlace;
		this.lowerRainPlace = lowerRainPlace;
	}

	
	@Override
	public String toString() {
		return "WeatherDTO [name=" + name + ", totalMonths=" + totalMonths + ", rainyMonth=" + rainyMonth
				+ ", heavyRainPlace=" + heavyRainPlace + ", lowerRainPlace=" + lowerRainPlace + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMonths() {
		return totalMonths;
	}

	public void setTotalMonths(int totalMonths) {
		this.totalMonths = totalMonths;
	}

	public String getRainyMonth() {
		return rainyMonth;
	}

	public void setRainyMonth(String rainyMonth) {
		this.rainyMonth = rainyMonth;
	}

	public String getHeavyRainPlace() {
		return heavyRainPlace;
	}

	public void setHeavyRainPlace(String heavyRainPlace) {
		this.heavyRainPlace = heavyRainPlace;
	}

	public String getLowerRainPlace() {
		return lowerRainPlace;
	}

	public void setLowerRainPlace(String lowerRainPlace) {
		this.lowerRainPlace = lowerRainPlace;
	}
}
