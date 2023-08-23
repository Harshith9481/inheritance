package com.Harshith.xworkz.inter.tasks.app;

public interface Metro {
	
	public abstract boolean dontAllowTheLiquorBottel(String bottels);
	
	
	public  abstract boolean dontAllowSharpMetals(String metals,String items);
	
	
	public abstract boolean allowsOnlyCardOrTokan(int payRupees,String cardName,int time);
	

}
