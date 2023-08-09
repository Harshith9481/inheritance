package com.kumar.xworkz.internal.hospital;

public class SugunaHospital extends Hospital{
	
	@Override
	public void wards()
	{
		System.out.println("no args const in hospital");
	}
	@Override
	public void wards(String name)
	{
		System.out.println("invoking main in String hospital name");
	}
	@Override
	public void wards(String name,String location)
	{
		System.out.println("invoking main in String hospital name and location");
	}
	@Override
	public void wards(String name,String location,int noOfLabour)
	{
		System.out.println("invoking main in String and int no of labour");
	}
	@Override
	public void wards(String name,String location,int noOfLabour,int noOfWards)
	{
		System.out.println("invoking main in String and int no of wards");
	}
	@Override
	public void wards(String name,String location,int noOfLabour,int noOfWards,double noOfFloor)
	{
		System.out.println("invoking main in String and int no of wards in floors");
	}
	@Override
	public void wards(String name,String location,int noOfLabour,int noOfWards,double noOfFloor,String docterName)
	{
		System.out.println("invoking main in String in docter name");
	}

}
