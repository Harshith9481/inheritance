package com.inheritance.chaning.Gold.app;

public class PureGold extends Gold{
	
	
	public PureGold()
	{
		this("jayloukas",100,120000,"shivmoga");
		System.out.println("no-args const of puregold");
	}	
	
	public PureGold(String storeName,int quantity,int price,String place)
	{
		super(storeName,quantity,price,place);
		System.out.println("All-arg cinst of puregold..");
	}

	}
	


