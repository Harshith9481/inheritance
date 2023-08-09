package com.kumar.xworkz.internal.Mall;

public class OrionMall extends Mall{
	
	
	
	@Override
	public void lulumall()
	{
		System.out.println("no args const in mall name");
	}
	@Override
	public void lulumall(String name)
	{
		System.out.println("invoking main in mall name");	
	}
	@Override
	public void lulumall(String name,String location)
	{
		System.out.println("invoking main in mall location");	
	}
	@Override
	public void lulumall(String name,String location,String landmark)
	{
		System.out.println("invoking main in mall location landmark");	
	}
	@Override
	public void lulumall(String name,String location,String landmark,int noOfItem)
	{
		System.out.println("invoking main in mall no of items");	
	}
	@Override
	public void lulumall(String name,String location,String landmark,int noOfItem,int price)
	{
		System.out.println("invoking main in mall item price");	
	}

}
