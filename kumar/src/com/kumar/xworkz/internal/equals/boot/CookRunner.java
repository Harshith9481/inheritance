package com.kumar.xworkz.internal.equals.boot;

import com.kumar.xworkz.internal.equals.Cook.Cook;

public class CookRunner {
	
	public static void main(String[] args) {
		
		Cook shaff=new Cook("jeevan","bengalure",14,20,"biryani",120);
		
		
		Cook shaff2=new Cook("jeevan","bengalure",1,20,"biryani",120);
		
		
		boolean same=shaff.equals(shaff2);
		
		System.out.println("cook name is same :" +same);
		
		System.out.println("cook location is same :" +same);
		
		System.out.println("cook time taken is same :" +same);
		
		System.out.println("cook dish name is same :" +same);
		
		System.out.println("cook price is same :" +same);
		
	}

}
