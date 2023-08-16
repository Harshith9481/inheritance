package com.kumar.xworkz.internal.object.logo;

public class Logo {
	
	
	private String name;
	private String color;
	private boolean design;
	private int size;
	private String designBy;
	
	
	public Logo()
	{
		System.out.println("no-args const for logo.....");
	}


	public Logo(String name, String color, boolean design, int size, String designBy) 
	{
		super();
		this.name = name;
		this.color = color;
		this.design = design;
		this.size = size;
		this.designBy = designBy;
	}
	
	@Override
	public String toString() {
		
		return "name:"+name +"color:" +color +"design:" +design +"size:" +size +"designBy:" +designBy;
	}
	

}
