package com.Xworkz.kumar.app;

public class Laptopp {
	
	private String brand;
	private String addition;
	private int price;
	private String storeName;
	private int ram;
	private Processor laptop;
	public Laptopp() {
		// TODO Auto-generated constructor stub
	}
	
	public Laptopp(String brand, String addition) {
		
		this.brand = brand;
		this.addition = addition;
	}

	public Laptopp(String brand, String addition, int price) {
		
		this.brand = brand;
		this.addition = addition;
		this.price = price;
	}

	public Laptopp(String brand, String addition, int price, String storeName) {
		
		this.brand = brand;
		this.addition = addition;
		this.price = price;
		this.storeName = storeName;
	}

	public Laptopp(String brand, String addition, int price, String storeName, int ram) {
		
		this.brand = brand;
		this.addition = addition;
		this.price = price;
		this.storeName = storeName;
		this.ram = ram;
	}
	
	public void hplaptop()
	{
		System.out.println("invoking main name of laptop");
		this.laptop.generation();
	}
	public void lapDisplay()
	{
		System.out.println("Brand Name is "+brand);
		System.out.println("Addithin is "+addition);
		System.out.println("Price is "+price);
		System.out.println("Store name kis "+storeName);
		System.out.println("Rame Size is "+ram);

	}
	
	

}
