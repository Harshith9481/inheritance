package com.inheritance.MethodOverloading.Flex.app;

public class Banner extends Flex{
	
	public Banner()
	{
		System.out.println("invoking banner called flux....");
	}
	
	
	@Override
	public void invite()
	{
		System.out.println("invoking main in invite .....");
	}

}
