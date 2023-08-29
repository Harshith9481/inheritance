package com.Xworkz.kumar.app;

public class Mobile {
	
	private String brand;
	private String name;
	private int price;
	private String storeName;
	private Charger watt;
	
	
	public Mobile(String brand, String name) {
		
		this.brand = brand;
		this.name = name;
	}

	public Mobile(String brand, String name, int price) {
		
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public Mobile(String brand, String name, int price, String storeName) {
		
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.storeName = storeName;
	}
	public void setCharger()
	{
		System.out.println("invoking main in set charger");
		this.vivo();
	}
	
	public void vivo()
	{
		System.out.println("invoking main vivo mobiles");
		this.watt.batteryful();
	}
	
	
	
	

}
