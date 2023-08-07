package com.inheritance.MethodOverloading.Umbrella.app;

public class Umbrella {
	
	public Umbrella umbrella;
	public String name;
	public int cost;
	public String color;
	public char size;
	
	
	public void rain()
	{
		System.out.println("invoking main in umbrella");
		rain("vikas");
		rain("vikas",250);
		rain("vikas",250,"black");
		rain("vikas",250,"black",'L');
	}
	public void rain(String name)
	{
		System.out.println("invoking main in umbrella name");
		System.out.println("brand name :"+name);
	}
	public void rain(String name,int cost)
	{
		System.out.println("invoking main in umbrella cost");
		System.out.println("umbrella cost :"+cost);
	}
	public void rain(String name,int cost,String color)
	{
		System.out.println("invoking main in umbrella color");
		System.out.println("umbrella color :"+color);
	}
	public void rain(String name,int cost,String color,char size)
	{
		System.out.println("invoking main in umbrella color");
		System.out.println("umbrella size :"+size);
	}

}
