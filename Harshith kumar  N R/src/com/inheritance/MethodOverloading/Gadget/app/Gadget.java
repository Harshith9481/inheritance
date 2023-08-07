package com.inheritance.MethodOverloading.Gadget.app;

public class Gadget {
	
	public String application;
	public String item;
	public String location;
	public int cost;
	
	
	public void mobile()
	{
		System.out.println("invoking main in gatget of mobile info");
		mobile("flipkart");
		mobile("flipkart","vivo 33s");
		mobile("flipkart","vivo 33s","mysore");
		mobile("flipkart","vivo 33s","mysore",23000);
	}
	
	public void mobile(String application)
	{
		System.out.println("invoking main in online applications");
		System.out.println("online application :"+application);
	}
	public void mobile(String application,String item)
	{
		System.out.println("invoking main in String item name and brand");
		System.out.println("item :"+item);
	}
	public void mobile(String application,String item,String location)
	{
		System.out.println("invoking main in String item name and brand");
		System.out.println("location :"+location);
	}
	public void mobile(String application,String item,String location,int cost)
	{
		System.out.println("invoking main in String item name and brand");
		System.out.println("mobile cost :"+cost);
	}

}
