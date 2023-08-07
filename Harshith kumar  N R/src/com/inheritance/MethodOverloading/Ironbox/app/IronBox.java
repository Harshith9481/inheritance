package com.inheritance.MethodOverloading.Ironbox.app;

public class IronBox {
	
	public String brand;
	public double time;
	public int price;
	public int watt;
	
	
	public void heat()
	{
	System.out.println("invoking heat in the ironbox");
	heat("bajaj");
	heat(12);
	heat("bajaj",12,8000);
	heat("bajaj",12,8000,210);
	}
	public void heat(String brand)
	{
		System.out.println("invoking heat in String in ironbox");
		System.out.println("name of the ironbox :"+brand);
		
	}
	public void heat(double time)
	{
		System.out.println("invoking heat in String and int in ironbox");
	
		System.out.println("time taken :"+time);
		
		
	}
	public void heat(String brand,double time,int price)
	{
		System.out.println("invoking heat in String and int");
				System.out.println("price of ironbox :"+price);
	}
	public void heat(String brand,double time,int price,int watt)
	{
		System.out.println("invoking heat in String and int");
		
		System.out.println("watt :"+watt);
	
	}

}
