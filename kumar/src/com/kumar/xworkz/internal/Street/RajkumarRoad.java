package com.kumar.xworkz.internal.Street;

public class RajkumarRoad extends Street{
	
	
	@Override
	public void puneetRajkumarRoad()
	{
		System.out.println("no args const of Street");
	}
	@Override
	public void puneetRajkumarRoad(String name)
	{
		System.out.println("invoking main in Street name");
	}
	@Override
	public void puneetRajkumarRoad(String name,String location)
	{
		System.out.println("invoking main in Street location");
	}
	@Override
	public void puneetRajkumarRoad(String name,String location,String districtName)
	{
		System.out.println("invoking main in Street location and string dist..");
	}
	@Override
	public void puneetRajkumarRoad(String name,String location,String districtName,String highwayNo)
	{
		System.out.println("invoking main in Street highwayNo");
	}
	@Override
	public void puneetRajkumarRoad(String name,String location,String districtName,String talukName,int Capacity)
	{
		System.out.println("invoking main in Street Capacity");
	}
	@Override
	public void puneetRajkumarRoad(String name,String location,String districtName,String talukName,int Capacity,int width)
	{
		System.out.println("invoking main in Street width");
	}

}
