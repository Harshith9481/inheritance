package com.kumar.xworkz.internal.Temple;

public class DeviTemple extends Temple{
	
	@Override
	public void ramTemple()
	{
		System.out.println("no args const of Temple name");
	}
	@Override
	public void ramTemple(String name)
	{
		System.out.println("invoking main in Temple name");
	}
	@Override
	public void ramTemple(String name,String location)
	{
		System.out.println("invoking main in Temple location");
	}
	@Override
	public void ramTemple(String name,String location,String districtName)
	{
		System.out.println("invoking main in Temple location and string dist..");
	}
	@Override
	public void ramTemple(String name,String location,String districtName,String talukName)
	{
		System.out.println("invoking main in Temple name");
	}
	@Override
	public void ramTemple(String name,String location,String districtName,String talukName,int Capacity)
	{
		System.out.println("invoking main in Temple Capacity");
	}
	@Override
	public void ramTemple(String name,String location,String districtName,String talukName,int Capacity,int noOfStaff)
	{
		System.out.println("invoking main in Temple no of staff");
	}
	

}
