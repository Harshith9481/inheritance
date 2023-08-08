package com.inheritance.MethodOverloading.Gate.app;

public class Protection extends Gate{
	
	public Protection()
	{
		System.out.println("invoking the gate protection");
	}
	@Override
	public void design()
	{
		System.out.println("invoking main in design process");
	}

}
