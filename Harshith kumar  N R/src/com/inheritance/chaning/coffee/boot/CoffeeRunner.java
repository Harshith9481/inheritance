package com.inheritance.chaning.coffee.boot;

import com.inheritance.chaning.coffee.*;
public class CoffeeRunner {

	public static void main(String[] args) {
		
	
	Coffee hot=new Coffee("Arora",150,210,true);
	System.out.println("Brand name :"+hot.brand);
	System.out.println("Quantity :"+hot.quantity);
	System.out.println("Price :"+hot.price);
	System.out.println("Tasty :"+hot.tasty);
	
	System.out.println("---------------");
	
	Sunrise hot1=new Sunrise();
	System.out.println("Brand name :"+hot1.brand);
	System.out.println("Quantity :"+hot1.quantity);
	System.out.println("Price :"+hot1.price);
	System.out.println("Tasty :"+hot1.tasty);
	
	}
}
