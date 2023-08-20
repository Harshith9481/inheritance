package com.kumar.xworkz.internal.equals.boot;

import com.kumar.xworkz.internal.equals.Ceo.Ceo;

public class CeoRunner {
	
	
	public static void main(String[] args) {
		
		
		Ceo director=new Ceo("google","vinay","bengaluru",14,870451,"google");
		
		
		Ceo director2=new Ceo("google","harshith","bengalore",16,87041,"google");
		
		boolean same=director.equals(director2);
		
		System.out.println("director of Ceo companyname is same "+same);
		System.out.println("director of Ceo softwear is same "+same);
		
		
	}
		
	}


