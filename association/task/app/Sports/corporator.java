package com.association.task.app.Sports;

public class corporator {
	public String name;
	public Building[] building;
	
	public corporator(String name,Building[] building )
	{
		this.name=name;
		this.building=building;
		
	}
	public void printInfo()
	{
		
		System.out.println("corporator name:" +name);
		
		for(int index=0;index<building.length;index++)
		{
			Building
			ref=this.building[index];
			ref.printInfo();
		}
		
	}

}
