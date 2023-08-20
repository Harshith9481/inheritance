package com.kumar.xworkz.internal.equals.boot;

import com.kumar.xworkz.internal.equals.Kalla.Kalla;

public class KallaRunner {
	
	
	public static void main(String[] args) {
		
		Kalla thief = new Kalla("sachin","kamakshipalya","harshith",87,186,12);
		
		
		Kalla thief1 = new Kalla("sachin","kamakshipalya","harshith",87,186,12);
		
		
		boolean same=thief.equals(thief1);
		
		System.out.println("thief name is same :" +same);
		
		System.out.println("thief location is same :" +same);
		
		System.out.println("thief owner name is same :" +same);
		
		System.out.println("thief no of items is same :" +same);
		
		System.out.println("thief cost per item is same :" +same);
		
		System.out.println("thief time is same :" +same);
	}

}
