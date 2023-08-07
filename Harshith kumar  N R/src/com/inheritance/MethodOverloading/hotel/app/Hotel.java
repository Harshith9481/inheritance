package com.inheritance.MethodOverloading.hotel.app;

public class Hotel {
	
	public String name;
	public String location;
	public String item;
	public int totalBill;
	
	public void menu()
	{
		System.out.println("invoking in hotel menu");
		menu("Aradya");
		menu("Aradya","rajajinagar");
		menu("Aradya","rajajinagar","non-veg");
		menu("Aradya","rajajinagar","non-veg",5000);
	}
	public void menu(String name)
	{
		System.out.println("invoking menu in String hotel name");
		System.out.println("hotel name :"+name);
	}
	public void menu(String name,String location)
	{
		System.out.println("invoking menu in String hotel location");
		System.out.println("hotel location :"+location);
	}
	public void menu(String name,String location,String item)
	{
		System.out.println("invoking menu in String hotel item");
		System.out.println("hotel item :"+item);
	}
	public void menu(String name,String location,String item,int totalBill) {
		System.out.println("invoking menu in String hotel item totalBill");
		System.out.println("total bill :"+totalBill);
	}

}
