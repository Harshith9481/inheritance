package com.kumar.xworkz.internal.object.Flag;

public class Flag {
	
	private String countryName;
	private String color;
	private String manufacuredPlace;
	
	
	public Flag()
	{
		System.out.println("no-args const in national flag...........");
	}


	public Flag(String countryName, String color, String manufacuredPlace) {
		super();
		this.countryName = countryName;
		this.color = color;
		this.manufacuredPlace = manufacuredPlace;
	}
	
	@Override
	public String toString() 
	{
				return "countryName:" +countryName +"color:" +color +"manufacuredPlace:" +manufacuredPlace;
	}

}
