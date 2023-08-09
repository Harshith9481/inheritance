package com.kumar.xworkz.internal.Pub;

public class ToitPub extends Pub{
	
	public void citybar()
	{
		System.out.println("no args const of Pub");
	}
	public void citybar(String name)
	{
		System.out.println("invoking main in Pub name");
	}
	public void citybar(String name,String location)
	{
		System.out.println("invoking main in Pub name and location");
	}
	public void citybar(String name,String location,int noOfItem)
	{
		System.out.println("invoking main in Pub items");
	}
	public void citybar(String name,String location,int noOfItem,int price)
	{
		System.out.println("invoking main in Pub items price");
	}
	public void citybar(String name,String location,int noOfItem,int price,int amount)
	{
		System.out.println("invoking main in Pub items price");
	}
	public void citybar(String name,String location,int noOfItem,int price,int amount,int bill)
	{
		System.out.println("invoking main in Pub items price bill");
	}
	

}
