package com.kumar.xworkz.internal.object.Cave;

public class Cave {
	
	private String name;
	private String anotherName;
	private String place;
	private String location;
	private String caveName;
	private int years;
	private int hightOfCave;
	private int width;
	private boolean natural;
	private int visiters;
	
	
	public Cave()
	{
		System.out.println("no args const in cave.....");
	}
	
	public Cave(String name, String anotherName, String place, String location, String caveName, int years,
			int hightOfCave, int width, boolean natural, int visiters) {
		super();
		this.name = name;
		this.anotherName = anotherName;
		this.place = place;
		this.location = location;
		this.caveName = caveName;
		this.years = years;
		this.hightOfCave = hightOfCave;
		this.width = width;
		this.natural = natural;
		this.visiters = visiters;
		
 
	}
	@Override
	public String toString() 
	{
				return "name:" +name +"anotherName:" +anotherName +"place:" +place +"location:" +location +"caveName"+caveName +"years:" +years +"hightOfCave:"+hightOfCave +"width:" +width +"natural:" +natural +"visiters:" +visiters;
	}
	
	
	

}
