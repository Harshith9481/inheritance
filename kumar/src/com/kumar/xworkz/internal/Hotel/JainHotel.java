package com.kumar.xworkz.internal.Hotel;

public class JainHotel extends Hotel{
	
	@Override
	public void menakshiBhavan()
	{
		System.out.println("no args const of hotel");
	}
	@Override
	public void menakshiBhavan(String name)
	{
		System.out.println("invoking main in hotel name");
	}
	@Override
	public void menakshiBhavan(String name,String location)
	{
		System.out.println("invoking main in hotel name and location");
	}
	@Override
	public void menakshiBhavan(String name,String location,int noOfItem)
	{
		System.out.println("invoking main in hotel items");
	}
	@Override
	public void menakshiBhavan(String name,String location,int noOfItem,int price)
	{
		System.out.println("invoking main in hotel items price");
	}
	@Override
	public void menakshiBhavan(String name,String location,int noOfItem,int price,int amount)
	{
		System.out.println("invoking main in hotel items price");
	}
	@Override
	public void menakshiBhavan(String name,String location,int noOfItem,int price,int amount,int bill)
	{
		System.out.println("invoking main in hotel items price bill");
	}

}
