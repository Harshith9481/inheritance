package com.inheritance.casting.chocolate.boot;

import com.inheritance.casting.chocolate.app.boot.*;

public class ChocolateRunner {


	public static void main(String[] args) {
		Chocolate cream=new Chocolate();
		DarkChocolate cream1=new DarkChocolate();
		CaramelChocolate cream2=new CaramelChocolate();
		
		ChocolateUtil.sweet(cream);
		System.out.println("------------------");
		ChocolateUtil.sweet(cream1);
		System.out.println("------------------");
		ChocolateUtil.sweet(cream2);
		System.out.println("------------------");
	}

}
