package com.association.task.app.Sports;

public class Floor {
	public String name;
	public int noOfFloors;
	
	
	
	public Floor(String name,int noOfFloors,int liftNo)
	{
		this.name=name;
		this.noOfFloors=noOfFloors;
		
	}
	public void printInfo()
	{
		System.out.println("....................................");
		
		System.out.println("floor name" +name);
		System.out.println("no of floor" +noOfFloors);
	}

}
