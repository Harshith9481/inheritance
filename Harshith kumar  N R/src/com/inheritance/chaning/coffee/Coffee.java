package com.inheritance.chaning.coffee;

public class Coffee {
	
	public String brand;
	public int quantity;
	public double price;
	public boolean tasty;
	
	public Coffee(String brand,int quantity,double price,boolean tasty)
	{
		this.brand=brand;
		this.quantity=quantity;
		this.price=price;
		this.tasty=tasty;
		System.out.println("String const of coffee");
	}

}
