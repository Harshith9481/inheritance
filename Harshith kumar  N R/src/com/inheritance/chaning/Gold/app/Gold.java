package com.inheritance.chaning.Gold.app;

public class Gold {
	public String storeName;
	public int quantity;
	public int price;
	public String place;
	
	
	public Gold(String storeName,int quantity,int price,String place)
	{
		this.storeName=storeName;
		this.quantity=quantity;
		this.price=price;
		this.place=place;
		System.out.println("String const of gold");
	}

}
