package com.association.task.app.Sports;

public class Area {
	
	public String name;
	public corporator corporator;
	
	public Area(String name,corporator corporator)
	{
		this.name=name;
		this.corporator=corporator;
		
	}
	public void printInfo()
	{
		System.out.println("info about area");
		System.out.println("name of the area" +name);
		System.out.println("........................................");
		corporator.printInfo();
	}
	
	

}
