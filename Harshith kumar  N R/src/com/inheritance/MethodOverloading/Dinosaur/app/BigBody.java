package com.inheritance.MethodOverloading.Dinosaur.app;

public class BigBody extends Dinosaur {
	
	
	public BigBody()
	{
		System.out.println("invoking the dinosour body");
	}
	@Override
	
	public void hunt()
	{
		System.out.println("invoking main in dinosour will hunt...");
	}

}
