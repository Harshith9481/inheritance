package com.inheritance.chaning.Gold.boot;

import com.inheritance.chaning.Gold.app.*;

public class GoldRunner {

	public static void main(String[] args) {
		Gold rare=new Gold("Bheema",100,13000,"N R Pura");
		System.out.println("Place :"+rare.place);
		System.out.println("Store Name :"+rare.storeName);
		System.out.println("Quantity :"+rare.quantity);
		System.out.println("Price :"+rare.price);
		
		System.out.println("---------------");
		
		PureGold rare1=new PureGold();
		System.out.println("Place :"+rare1.place);
		System.out.println("Store Name :"+rare1.storeName);
		System.out.println("Quantity :"+rare1.quantity);
		System.out.println("Price :"+rare1.price);
	}
	
}
