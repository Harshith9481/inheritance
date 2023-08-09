package com.kumar.xworkz.internal.Hostel;

public class jainHostel extends Hostel{
	
	
	@Override
	public void collagehostel()
	{
		System.out.println("no args const of collage hostel");
	}
	@Override
	public void collagehostel(String name)
	{
		System.out.println("invoking main in hostel name");
	}
	@Override
	public void collagehostel(String name,String location)
	{
		System.out.println("invoking main in hostel location");
	}
	@Override
	public void collagehostel(String name,String location,String districtName)
	{
		System.out.println("invoking main in hostel location and string dist..");
	}
	@Override
	public void collagehostel(String name,String location,String districtName,String wardenName)
	{
		System.out.println("invoking main in hostel warden name");
	}
	@Override
	public void collagehostel(String name,String location,String districtName,String wardenName,int noOfStudents)
	{
		System.out.println("invoking main in hostel students");
	}
	@Override
	public void collagehostel(String name,String location,String districtName,String wardenName,int noOfStudents,int noOfStaff)
	{
		System.out.println("invoking main in hostel no of staff");
	}


}
