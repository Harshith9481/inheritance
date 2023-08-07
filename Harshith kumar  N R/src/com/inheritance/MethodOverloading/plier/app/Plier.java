package com.inheritance.MethodOverloading.plier.app;

public class Plier {
	
	public String brand;
	public int cost;
	public String type;
	public String color;
	
	
	
	public void cuttingPlier()
	{
		System.out.println("invoking main in plier");
		cuttingPlier("vishak");
		cuttingPlier("vishak",50);
		cuttingPlier("vishak",50,"cutting plier");
		cuttingPlier("vishak",50,"cutting plier","blue");
		
	}
	public void cuttingPlier(String brand)
	{
		System.out.println("invoking main in brand of cutting plier");
		System.out.println("brand :"+brand);
	}
	public void cuttingPlier(String brand,int cost)
	{
		System.out.println("invoking main in cost of cutting plier");
		System.out.println("cost :"+cost);
	}
	public void cuttingPlier(String brand,int cost,String type)
	{
		System.out.println("invoking main in cost of cutting plier");
		System.out.println("type :"+type);
	}
	public void cuttingPlier(String brand,int cost,String type,String color)
	{
		System.out.println("invoking main in cost of cutting plier");
		System.out.println("color :"+color);
	}
	

}
