package com.inheritance.MethodOverloading.Mouse.app;

public class Mouse {
	
	public String brand;
	public String name;
	public String type;
	public int cost;
	
	
	public void slide()
	{
		System.out.println("invoking main in mouse info");
		slide("hp");
		slide("hp","optical");
		slide("hp","optical","wireless");
		slide("hp","optical","wireless",699);
	}
	
	public void slide(String brand)
	{
		System.out.println("invoking main in brand name");
		System.out.println("brand name :"+brand);
	}
	public void slide(String brand,String name)
	{
		System.out.println("invoking main in brand name");
		System.out.println("brand name :"+name);
	}
	public void slide(String brand,String name,String type)
	{
		System.out.println("invoking main in mouse type");
		System.out.println("mouse type :"+type);
	}
	public void slide(String brand,String name,String type,int cost)
	{
		System.out.println("invoking main in mouse cost");
		System.out.println("mouse cost :"+cost);
	}

}
