package com.inheritance.MethodOverloading.ladder.app;

public class Ladder {

	public String material;
	public double height;
	public double weight;
	public int price;
	
	
	public void steps()
	{
		System.out.println("invoking main in ladder steps");
		steps("Banbo");
		steps("Banbo",140);
		steps("Banbo",140,40);
		steps("Banbo",140,40,4500);
		
	}
	public void steps(String material)
	{
		System.out.println("invoking main in ladder steps");
		System.out.println("used material :"+material);
	}
	public void steps(String material,double height)
	{
		System.out.println("invoking main in ladder steps");
		System.out.println("height of ladder:"+height);
	}
	public void steps(String material,double height,double weight)
	{
		System.out.println("invoking main in ladder steps");
		System.out.println("weight of ladder :"+weight);
	}
	public void steps(String material,double height,double weight,int price)
	{
		System.out.println("invoking main in ladder steps");
		System.out.println("price of ladder :"+price);
	}
		
}
