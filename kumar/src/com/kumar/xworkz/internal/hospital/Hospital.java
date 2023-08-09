package com.kumar.xworkz.internal.hospital;

public class Hospital {
	
	public String name;
	public String location;
	public int noOfLabour;
	public int noOfWards;
	public double noOfFloor;
	public String docterName;
	
	
	public void wards()
	{
		System.out.println("no args const in hospital");
	}
	public void wards(String name)
	{
		System.out.println("invoking main in String hospital name");
	}
	public void wards(String name,String location)
	{
		System.out.println("invoking main in String hospital name and location");
	}
	public void wards(String name,String location,int noOfLabour)
	{
		System.out.println("invoking main in String and int no of labour");
	}
	public void wards(String name,String location,int noOfLabour,int noOfWards)
	{
		System.out.println("invoking main in String and int no of wards");
	}
	public void wards(String name,String location,int noOfLabour,int noOfWards,double noOfFloor)
	{
		System.out.println("invoking main in String and int no of wards in floors");
	}
	public void wards(String name,String location,int noOfLabour,int noOfWards,double noOfFloor,String docterName)
	{
		System.out.println("invoking main in String in docter name");
	}
	

}
