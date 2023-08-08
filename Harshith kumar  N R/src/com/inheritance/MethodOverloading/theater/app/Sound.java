package com.inheritance.MethodOverloading.theater.app;

public class Sound extends Theater{
	
	
	public Sound()
	{
		System.out.println("invoking main in sound in theater");
	}
	
	@Override
	public void film()
	{
		System.out.println("invoking main in film in theater");
	}

}
