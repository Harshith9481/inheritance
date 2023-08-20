package com.kumar.xworkz.internal.equals.Cook;


public class Cook {
	
	private String name;
	private String location;
	private int noOfdish;
	private int time;
	private String dish;
	private int price;
	
	
	public Cook()
	{
		System.out.println("invoking main in Cook maker...");
	}


	
	public Cook(String name, String location, int noOfdish, int time, String dish, int price) {
		super();
		this.name = name;
		this.location = location;
		this.noOfdish = noOfdish;
		this.time = time;
		this.dish = dish;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		System.out.println("invoking to String of Cook..");
		return "name :" +name +"location :" +location +"noOfdish :" +noOfdish +"time :" +time +"dish :" +dish +"price :" +price;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			System.out.println("obj is equal to null..");
			if(obj instanceof Cook)
			{
				System.out.println("obj is intance of Cook..");
				Cook cook=(Cook)obj;
				if(cook.name.equals(this.name)&&cook.location.equals(location)&&cook.noOfdish==(this.noOfdish)&&cook.time==(this.time)&&cook.dish.equals(this.dish)&&cook.price==(this.price))
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same..");
				}	
			}
			else
			{
				System.out.println("obj is not of Cook..");
			}
		}
		else
		{
			System.out.println("obj is not equal to null...");
		}

	return false;
	}
}

