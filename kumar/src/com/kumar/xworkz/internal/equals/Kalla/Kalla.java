package com.kumar.xworkz.internal.equals.Kalla;


public class Kalla {
	
	
	private String name;
	private String location;
	private String ownerName;
	private int noOfItems;
	private int costPerItem;
	private int time;
	
	
	public Kalla()
	{
		System.out.println("no-args const in kalla");
	}


	
	public Kalla(String name, String location, String ownerName, int noOfItems, int costPerItem, int time) {
		super();
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
		this.noOfItems = noOfItems;
		this.costPerItem = costPerItem;
		this.time = time;
	}
	
	@Override
	public String toString()
	{
		System.out.println("invoking to String of Kalla..");
		return "name :" +name +"location :" +location +"ownerName :" +ownerName +"noOfItems :" +noOfItems +"costPerItem :" +costPerItem +"time :" +time;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			System.out.println("obj is equal to null..");
			if(obj instanceof Kalla)
			{
				System.out.println("obj is intance of Kalla..");
				Kalla kalla1=(Kalla)obj;
				if(kalla1.name.equals(this.name)&&kalla1.location==(location)&&kalla1.ownerName.equals(this.ownerName)&&kalla1.noOfItems==(this.noOfItems));
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same..");
				}	
			else
			{
				System.out.println("obj is not of Mechanic..");
			}
		else
		{
			System.out.println("obj is not equal to null...");
		}
	return false;
	}
}
