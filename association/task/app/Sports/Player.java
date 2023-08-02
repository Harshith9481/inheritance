package com.association.task.app.Sports;

public class Player {
	
	public String name;
	public String exp;
	public Building building;
	public Hometown hometown;
	
	public Player(String name,String exp,Building building,Hometown hometown)
	{
		this.name=name;
		this.exp=exp;
		this.hometown=hometown;
		this.building=building;
		
		
	}
	public void printInfo()
	{
		System.out.println("info about players");
		
		
		System.out.println("name" +name);
		System.out.println("experience player" +exp);
		
		hometown.printInfo();
		
		System.out.println(".............................");
		
		building.printInfo();
		
		
		
	}
	

}
