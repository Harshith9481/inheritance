package com.inheritance.chaning.coffee;

public class Sunrise extends Coffee{

	
	public Sunrise()
	{
		this("Sunrise",120,400,false);
		System.out.println("no-args const of Sunrise");
	}	
	
	public Sunrise(String brand,int quantity,double price,boolean tasty)
	{
		super(brand,quantity,price,tasty);
		System.out.println("All-arg cinst of Sunrise..");
	}
}
