package com.kumar.xworkz.internal.Zoo;

public class Zoo {

	public String name;
	public String location;
	public int ticketPrice;
	public int noOfAnimals;
	public int noOfBirds;
	
	public void cage()
	{
		System.out.println("invoking cage of no-arg");
	}
	
	public void cage(String name)
	{
		System.out.println("invoking cage of String");
	}
	
	public void cage(String name,String location)
	{
		System.out.println("invoking cage of String and String");
	}
	
	public void cage(String name,String location,int ticketPrice)
	{
		System.out.println("invoking cage of String, String and int");
	}
	
	public void cage(String name,String location,int ticketPrice,int noOfAnimals)
	{
		System.out.println("invoking cage of String, String, int and int");
	}
	public void cage(String name,String location,int ticketPrice,int noOfAnimals,int noOfBirds)
	{
		System.out.println("invoking cage of String, String, int, int and int ");
	}
	
	
}
