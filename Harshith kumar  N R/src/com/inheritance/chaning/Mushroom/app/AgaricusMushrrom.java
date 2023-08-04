package com.inheritance.chaning.Mushroom.app;

public class AgaricusMushrrom extends Mushroom{
	public AgaricusMushrrom()
	{
	this("white",150,'S',"nr pura");
	System.out.println("no-args const of Mushroom");
	}

	public AgaricusMushrrom(String color,int cost,char size,String location)
	{
	
		super(color,cost,size,location);
		System.out.println("All-arg cinst of Mushroom..");
	}
	
}




