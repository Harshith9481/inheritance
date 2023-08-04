package com.inheritance.chaning.Ground.app;

public class ChinnaswamiGround extends Ground{
	
	
	public ChinnaswamiGround()
	{
		this("Kantirava","nadini layout",4000,1500);
		System.out.println("no-args const of Sunrise");
	}	
	
	public ChinnaswamiGround(String name,String location,int settingCapacity,int length)
	{
		super(name,location,settingCapacity,length);
		System.out.println("All-arg cinst of Sunrise..");
	}
}


