package com.inheritance.chaning.Mushroom.boot;

import com.inheritance.chaning.Mushroom.app.*;

public class MushroomRunner {
	
	public static void main(String[] args) {
		
		Mushroom tasty=new Mushroom("Green",160,'M',"Anaveri");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("color of mushroom :"+tasty.color);
		System.out.println("cost :"+tasty.cost);
		System.out.println("size :"+tasty.size);
		System.out.println("location :"+tasty.location);
		
		System.out.println("---------------------------------------------");
		
		AgaricusMushrrom tasty1=new AgaricusMushrrom();
		System.out.println("color of mushroom :"+tasty1.color);
		System.out.println("cost :"+tasty1.cost);
		System.out.println("size :"+tasty1.size);
		System.out.println("location :"+tasty1.location);
	}

}
