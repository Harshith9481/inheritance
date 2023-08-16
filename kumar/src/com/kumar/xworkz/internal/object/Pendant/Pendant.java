package com.kumar.xworkz.internal.object.Pendant;

public class Pendant {
	
	private String type;
	private String design;
	private String Stronename;
	private String color;
	private int time;
	private String manufacturedBy;
	private int introdusedOn;
	private int goldUsed;
	private int tempUsed;
	private String salesBy;
	private int cost;
	
	
	public Pendant()
	{
	System.out.println("no args const in pendant......");	
	}
	
	public Pendant(String type, String design, String stronename, String color, int time, String manufacturedBy,
			int introdusedOn, int goldUsed, int tempUsed, String salesBy, int cost) {
		super();
		this.type = type;
		this.design = design;
		Stronename = stronename;
		this.color = color;
		this.time = time;
		this.manufacturedBy = manufacturedBy;
		this.introdusedOn = introdusedOn;
		this.goldUsed = goldUsed;
		this.tempUsed = tempUsed;
		this.salesBy = salesBy;
		this.cost = cost;
		
		
		
	}
	@Override
	public String toString() {
		
		return "type:"+type +"design:" +design +"stronename:" +stronename +"color:" +color +"time:" +time +"manufacturedBy:"+manufacturedBy +"introdusedOn:"+introdusedOn +"goldUsed:" +goldUsed+ "tempUsed:"+tempUsed + "salesBy:" +salesBy + "cost:" +cost;
	}
	
	
	

}
