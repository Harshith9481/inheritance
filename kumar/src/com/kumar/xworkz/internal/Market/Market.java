package com.kumar.xworkz.internal.Market;

public class Market {
	
	public String name;
	public String location;
	public String landmark;
	public int noOfItem;
	public int price;
	
	public void krmarket()
	{
		System.out.println("no args const in Market name");
	}
	public void krmarket(String name)
	{
		System.out.println("invoking main in Market name");	
	}
	public void krmarket(String name,String location)
	{
		System.out.println("invoking main in Market location");	
	}
	public void krmarket(String name,String location,String landmark)
	{
		System.out.println("invoking main in Market location landmark");	
	}
	public void krmarket(String name,String location,String landmark,int noOfItem)
	{
		System.out.println("invoking main in Market no of items");	
	}
	public void krmarket(String name,String location,String landmark,int noOfItem,int price)
	{
		System.out.println("invoking main in Market item price");	
	}
	

}
