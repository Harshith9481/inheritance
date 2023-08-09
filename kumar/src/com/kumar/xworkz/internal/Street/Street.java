package com.kumar.xworkz.internal.Street;

public class Street {
	
	public String name;
	public String location;
	public String districtStreetName;
	public String highwayNo;
	public int Capacity;
	public int width;
	
	
	public void puneetRajkumarRoad()
	{
		System.out.println("no args const of Street");
	}
	public void puneetRajkumarRoad(String name)
	{
		System.out.println("invoking main in Street name");
	}
	public void puneetRajkumarRoad(String name,String location)
	{
		System.out.println("invoking main in Street location");
	}
	public void puneetRajkumarRoad(String name,String location,String districtName)
	{
		System.out.println("invoking main in Street location and string dist..");
	}
	public void puneetRajkumarRoad(String name,String location,String districtName,String highwayNo)
	{
		System.out.println("invoking main in Street highwayNo");
	}
	
	public void puneetRajkumarRoad(String name,String location,String districtName,String talukName,int Capacity)
	{
		System.out.println("invoking main in Street Capacity");
	}
	public void puneetRajkumarRoad(String name,String location,String districtName,String talukName,int Capacity,int width)
	{
		System.out.println("invoking main in Street width");
	}
	

}
