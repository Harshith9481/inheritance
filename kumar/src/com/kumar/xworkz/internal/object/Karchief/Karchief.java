package com.kumar.xworkz.internal.object.Karchief;

public class Karchief {
	
	private String type;
	private String color;
	private int size;
	private boolean design;
	private String material;
	private String StichedBy;
	private int price;
	
	
	public Karchief()
	{
		System.out.println("no-args const in karchief.....");
	}


	public Karchief(String type, String color, int size, boolean design, String material, String StichedBy, int price) {
		super();
		this.type = type;
		this.color = color;
		this.size = size;
		this.design = design;
		this.material = material;
		this.StichedBy = StichedBy;
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
				return "type:" +type +"color:" +color +"size:" +size +"design:" +design +"material"+material +"StichedBy:" +StichedBy +"price:"+price;
	}
	

}
