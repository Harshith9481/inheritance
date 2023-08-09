package com.kumar.xworkz.internal.Temple;

public class Temple {
	
	public String name;
	public String location;
	public String districtName;
	public String talukName;
	public int Capacity;
	public int noOfStaff;
	

	public void ramTemple()
	{
		System.out.println("no args const of Temple");
	}
	public void ramTemple(String name)
	{
		System.out.println("invoking main in Temple name");
	}
	public void ramTemple(String name,String location)
	{
		System.out.println("invoking main in Temple location");
	}
	public void ramTemple(String name,String location,String districtName)
	{
		System.out.println("invoking main in Temple location and string dist..");
	}
	public void ramTemple(String name,String location,String districtName,String talukName)
	{
		System.out.println("invoking main in Temple name");
	}
	
	public void ramTemple(String name,String location,String districtName,String talukName,int Capacity)
	{
		System.out.println("invoking main in Temple Capacity");
	}
	public void ramTemple(String name,String location,String districtName,String talukName,int Capacity,int noOfStaff)
	{
		System.out.println("invoking main in Temple no of staff");
	}
	

}
