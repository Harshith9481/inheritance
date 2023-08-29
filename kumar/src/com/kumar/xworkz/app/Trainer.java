package com.Xworkz.kumar.app;

public class Trainer {
	
	private String instituteName;
	private String TrinerName;
	private int time;
	private int exp;
	private Laptopp brand;
	private Laptop laptop;
	public Trainer(String instituteName,String TrinerName,int time,int exp)
	{
		this.instituteName="instituteName";
		this.TrinerName="Omkar";
		this.exp=13;
		this.time=8;
	}
	
	public void setBrand(Laptopp brand)
	{
		this.brand=brand;
	}
	
	public void teaching()
	{
		System.out.println("invoking good teaching by triner");
		this.laptop.work();
	}
	public void display() {
		System.out.println("Instuite name is  "+instituteName);
		System.out.println("Instuite name is  "+TrinerName);
		System.out.println("Instuite name is  "+time);
		System.out.println("Instuite name is  "+exp);
	


	}
	
	
	

}
