package com.kumar.xworkz.internal.Hostel;

public class Hostel {
	
	public String name;
	public String location;
	public String districtName;
	public String wardenName;
	public int noOfStudents;
	public int noOfStaff;
	
	
	public void collagehostel()
	{
		System.out.println("no args const of collage hostel");
	}
	public void collagehostel(String name)
	{
		System.out.println("invoking main in hostel name");
	}
	public void collagehostel(String name,String location)
	{
		System.out.println("invoking main in hostel location");
	}
	public void collagehostel(String name,String location,String districtName)
	{
		System.out.println("invoking main in hostel location and string dist..");
	}
	public void collagehostel(String name,String location,String districtName,String wardenName)
	{
		System.out.println("invoking main in hostel warden name");
	}
	
	public void collagehostel(String name,String location,String districtName,String wardenName,int noOfStudents)
	{
		System.out.println("invoking main in hostel students");
	}
	public void collagehostel(String name,String location,String districtName,String wardenName,int noOfStudents,int noOfStaff)
	{
		System.out.println("invoking main in hostel no of staff");
	}

}
