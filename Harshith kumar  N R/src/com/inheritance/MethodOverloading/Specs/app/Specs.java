package com.inheritance.MethodOverloading.Specs.app;

public class Specs {
	
	public String brand;
	public int price;
	public String location;
	public String Store;
	
	
	public void glass()
	{
		System.out.println("invoking main in specs in glass");
		glass("john jacobs");
		glass("john jacobs",6000);
		glass("john jacobs",6000,"bengaluru");
		glass("john jacobs",6000,"bengaluru","lenskart");
	}
	
	public void glass(String brand)
	{
		System.out.println("invoking main in specs glass String brand0");
		System.out.println("brand name :"+brand);
	}
	public void glass(String brand,int price)
	{
		System.out.println("invoking main in specs glass String and price of specs");
		System.out.println("price of specs :"+price);
	}
	public void glass(String brand,int price,String location)
	{
		System.out.println("invoking main in specs glass String and price of specs");
		System.out.println("location of store :"+location);
	}
	public void glass(String brand,int price,String location,String store)
	{
		System.out.println("invoking main in specs glass String and price of specs");
		System.out.println("store name:"+store);
	}

}
