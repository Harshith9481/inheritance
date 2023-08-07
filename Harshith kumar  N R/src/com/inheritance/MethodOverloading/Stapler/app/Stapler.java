package com.inheritance.MethodOverloading.Stapler.app;

public class Stapler {
	
	public String name;
	public int cost;
	public char size;
	public String material;
	
	public void pin()
	{
		System.out.println("invoking main in stapler pin");
		pin("akash");
		pin("akash",60);
		pin("akash",60,'L');
		pin("akash",60,'L',"metal");
		
	}
	public void pin(String name)
	{
	System.out.println("invoking main in stapler name");
	System.out.println("stapler name :"+name);
	}
	public void pin(String name,int cost)
	{
	System.out.println("invoking main in stapler cost");
	System.out.println("stapler cost :"+cost);
	}
	public void pin(String name,int cost,char size)
	{
	System.out.println("invoking main in stapler size");
	System.out.println("stapler size :"+size);
	}
	public void pin(String name,int cost,char size,String material)
	{
	System.out.println("invoking main in stapler size");
	System.out.println("stapler material :"+material);
	}

}
