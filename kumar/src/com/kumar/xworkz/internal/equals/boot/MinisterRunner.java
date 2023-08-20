package com.kumar.xworkz.internal.equals.boot;

import com.kumar.xworkz.internal.equals.minister.Minister;

public class MinisterRunner {
	
	
	public static void main(String[] args) {
		
	
		
		Minister minister=new Minister("kumarswami",5,"chanpatna","janatha dal");
		
		
		Minister minister1=new Minister("Nikil kumarswami",5,"mandya","janatha dal");
		
		
		boolean same=minister.equals(minister1);
		
		System.out.println("minister party name is same "+same);
		
		
	}

}
