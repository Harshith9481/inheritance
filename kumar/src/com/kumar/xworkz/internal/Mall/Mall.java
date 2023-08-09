package com.kumar.xworkz.internal.Mall;

public class Mall {
	
	public String name;
	public String location;
	public String landmark;
	public int noOfItem;
	public int price;

	
	public void lulumall()
	{
		System.out.println("no args const in mall name");
	}
	public void lulumall(String name)
	{
		System.out.println("invoking main in mall name");	
	}
	public void lulumall(String name,String location)
	{
		System.out.println("invoking main in mall location");	
	}
	public void lulumall(String name,String location,String landmark)
	{
		System.out.println("invoking main in mall location landmark");	
	}
	public void lulumall(String name,String location,String landmark,int noOfItem)
	{
		System.out.println("invoking main in mall no of items");	
	}
	public void lulumall(String name,String location,String landmark,int noOfItem,int price)
	{
		System.out.println("invoking main in mall item price");	
	}
	
	

}
