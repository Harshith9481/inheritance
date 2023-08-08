package com.inheritance.MethodOverloading.Drum.app;

public class Collect extends Drum{

	public Collect()
	{
		System.out.println("invoing main in collect water.....");
	}
	
	
	@Override
	public void Store()
	{
		System.out.println("invoking main in Store water");
	}
}
