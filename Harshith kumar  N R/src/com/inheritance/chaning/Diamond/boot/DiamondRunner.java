package com.inheritance.chaning.Diamond.boot;

import com.inheritance.chaning.Diamond.app.Diamond;
import com.inheritance.chaning.Diamond.app.EmeraldDiamond;

public class DiamondRunner  {
	public static void main(String[] args) {
		
		Diamond gold=new Diamond('M',18000,"bengaluru","green");
		System.out.println("size :"+gold.size);
		System.out.println("location :"+gold.location);
		System.out.println("cost:"+gold.cost);
		System.out.println("color :"+gold.color);
		
		
		EmeraldDiamond gold1=new EmeraldDiamond();
		System.out.println("size :"+gold1.size);
		System.out.println("location :"+gold1.location);
		System.out.println("cost:"+gold1.cost);
		System.out.println("color :"+gold1.color);
		
	}

}
