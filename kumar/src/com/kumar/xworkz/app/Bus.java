package com.Xworkz.kumar.app;

public class Bus {
	
	private String brand;
	private String nameOfBus;
	private int regNo;
	private String Busno;
	private Passenger seats;
	
	public Bus(String brand,String nameOfBus,int regNo,String Busno)
	{
	
	this.brand="brand";
	this.Busno="Busno";
	this.nameOfBus="nameOfBus";
	this.regNo=regNo;
	}
	
	public void setSeats(Passenger seats)
	{
		this.seats=seats;
	}
	
	
	public void travel()
	{
		System.out.println("invoking in passengers travelled in buses");
		this.seats.people();
	}

}
