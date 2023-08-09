package com.kumar.xworkz.internal.Theater;

public class GithangaliTheater extends Theater{
	
	@Override
	public void jmjTheater()
	{
		System.out.println("no args const of Theater hostel");
	}
	@Override
	public void jmjTheater(String name)
	{
		System.out.println("invoking main in Theater name");
	}
	@Override
	public void collajmjTheatergehostel(String name,String location)
	{
		System.out.println("invoking main in Theater location");
	}
	@Override
	public void jmjTheater(String name,String location,String districtName)
	{
		System.out.println("invoking main in Theater location and string dist..");
	}
	@Override
	public void jmjTheater(String name,String location,String districtName,String OwnerName)
	{
		System.out.println("invoking main in Theater OwnerName");
	}
	@Override
	public void jmjTheater(String name,String location,String districtName,String OwnerName,int settingCapacity)
	{
		System.out.println("invoking main in Theater settingCapacity");
	}
	@Override
	public void jmjTheater(String name,String location,String districtName,String OwnerName,int settingCapacity,int noOfStaff)
	{
		System.out.println("invoking main in Theater no of staff");
	}

}
