package com.inheritance.MethodOverloading.Mic.app;

public class Amplifier extends Mic{
	
	public Amplifier()
	{
		System.out.println("invoking main amplifier to resive signal....");
	}
	
	@Override
	public void signal()
	{
		System.out.println("invoking main in signal..");
	}

}
