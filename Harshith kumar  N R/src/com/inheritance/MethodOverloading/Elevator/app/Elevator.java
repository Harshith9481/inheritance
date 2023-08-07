package com.inheritance.MethodOverloading.Elevator.app;

public class Elevator {
	
	public String brand;
	public String type;
	public int cost;
	public int capacity;
	
	
	public void move()
	{
		System.out.println("invoking main elevators");
		move("BG elevators");
		move("BG elevators","lift");
		move("BG elevators","lift",80000);
		move("BG elevators","lift",80000,8);
	}
	
	public void move(String brand)
	{
		System.out.println("invoking main in brand name");
		System.out.println("brand :"+brand);
	}
	public void move(String brand,String type)
	{
		System.out.println("invoking main in elevators type");
		System.out.println("type :"+type);
	}
	public void move(String brand,String type,int cost)
	{
		System.out.println("invoking main in elevators cost");
		System.out.println("cost :"+cost);
	}
	public void move(String brand,String type,int cost,int capacity)
	{
		System.out.println("invoking main in elevators capacity");
		System.out.println("capacity :"+capacity);
	}

}
