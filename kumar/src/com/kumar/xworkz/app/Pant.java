package com.Xworkz.kumar.app;

public class Pant {
	
	private String brand;
	private String color;
	private String type;
	private char size;
	private Zip chain;
	
	
	public Pant(String brand, String color, String type, char size) {
		
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
	}
	public void setPant()
	{
		System.out.println("invoking main in pant zip");
		this.shorts();
	}
	
	public void shorts()
	{
		System.out.println("invoking in pant have a makes shorts");
		this.chain.PantZip();
	}
	
	

}
