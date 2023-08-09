package com.kumar.xworkz.internal.Hotel;

public class Hotel {
	
	public String name;
	public String location;
	public int noOfItem;
	public int price;
	public int amount;
	public String bill;
	
	
	public void menakshiBhavan()
	{
		System.out.println("no args const of hotel");
	}
	public void menakshiBhavan(String name)
	{
		System.out.println("invoking main in hotel name");
	}
	public void menakshiBhavan(String name,String location)
	{
		System.out.println("invoking main in hotel name and location");
	}
	public void menakshiBhavan(String name,String location,int noOfItem)
	{
		System.out.println("invoking main in hotel items");
	}
	public void menakshiBhavan(String name,String location,int noOfItem,int price)
	{
		System.out.println("invoking main in hotel items price");
	}
	public void menakshiBhavan(String name,String location,int noOfItem,int price,int amount)
	{
		System.out.println("invoking main in hotel items price");
	}
	public void menakshiBhavan(String name,String location,int noOfItem,int price,int amount,int bill)
	{
		System.out.println("invoking main in hotel items price bill");
	}
	
	
	

}
