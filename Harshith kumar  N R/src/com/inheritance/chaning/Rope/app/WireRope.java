package com.inheritance.chaning.Rope.app;

public class WireRope extends Rope{
	
	public WireRope()
	{
		this(1000,4500,"wirerope","metal Wire");
		System.out.println("no-args const of Sunrise");
	}	
	
	public WireRope(int length,int cost,String type,String material)
	{
		super(length,cost,type,material);
		System.out.println("All-arg cinst of Sunrise..");
	}
}


