package com.inheritance.chaning.Diamond.app;

public class EmeraldDiamond extends Diamond {
	
	public EmeraldDiamond()
	{
		this('S',19000,"white","mysore");
		System.out.println("no-args const of EmeraldDiamond");
	}	
	
	public EmeraldDiamond(char size,int cost,String color,String location)
	{
		super(size,cost,color,location);
		System.out.println("All-arg cinst of EmeraldDiamond..");
	}
}


