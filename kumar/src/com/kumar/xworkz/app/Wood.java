package com.Xworkz.kumar.app;

public class Wood {
	
	private String woodName;
	private int size;
	private String paperName;
	private int price;
	private Paper newspaper;
	
	
	
	public Wood(String woodName, int size, String paperName, int price) {
		
		this.woodName = woodName;
		this.size = size;
		this.paperName = paperName;
		this.price = price;
	}
	
	public void setNewsPaper(Paper newspaper) {
		this.newspaper=newspaper;
		this.tree();
		
	}
	
	public void tree()
	{
		System.out.println("invoking main in tree cuting and makes paper");
		this.newspaper.Vijaykarnataka();
	}
	
	
	

}
