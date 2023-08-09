package com.kumar.xworkz.internal.Market;

public class ChikpeteMarket extends Market{
	
	@Override
	public void krmarket()
	{
		System.out.println("no args const in Market name");
	}
	@Override
	public void krmarket(String name)
	{
		System.out.println("invoking main in Market name");	
	}
	@Override
	public void krmarket(String name,String location)
	{
		System.out.println("invoking main in Market location");	
	}
	@Override
	public void krmarket(String name,String location,String landmark)
	{
		System.out.println("invoking main in Market location landmark");	
	}
	@Override
	public void krmarket(String name,String location,String landmark,int noOfItem)
	{
		System.out.println("invoking main in Market no of items");	
	}
	@Override
	public void krmarket(String name,String location,String landmark,int noOfItem,int price)
	{
		System.out.println("invoking main in Market item price");	
	}

}
