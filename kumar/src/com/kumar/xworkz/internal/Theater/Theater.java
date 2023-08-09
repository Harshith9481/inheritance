package com.kumar.xworkz.internal.Theater;

public class Theater {
	
	public String name;
	public String location;
	public String districtName;
	public String OwnerName;
	public int settingCapacity;
	public int noOfStaff;
	
	
	
	public void jmjTheater()
	{
		System.out.println("no args const of Theater hostel");
	}
	public void jmjTheater(String name)
	{
		System.out.println("invoking main in Theater name");
	}
	public void collajmjTheatergehostel(String name,String location)
	{
		System.out.println("invoking main in Theater location");
	}
	public void jmjTheater(String name,String location,String districtName)
	{
		System.out.println("invoking main in Theater location and string dist..");
	}
	public void jmjTheater(String name,String location,String districtName,String OwnerName)
	{
		System.out.println("invoking main in Theater OwnerName");
	}
	
	public void jmjTheater(String name,String location,String districtName,String OwnerName,int settingCapacity)
	{
		System.out.println("invoking main in Theater settingCapacity");
	}
	public void jmjTheater(String name,String location,String districtName,String OwnerName,int settingCapacity,int noOfStaff)
	{
		System.out.println("invoking main in Theater no of staff");
	}
	

}
