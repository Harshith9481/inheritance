package com.kumar.xworkz.internal.equals.boot;

import com.kumar.xworkz.internal.equals.Mechanic.Mechanic;

public class MechanicRunner {
	
	public static void main(String[] args) {
		
		Mechanic mech=new Mechanic("harshith","nrpura","revanna",14,150,40);
		
		Mechanic mech1=new Mechanic("harshith","nrpura","vinay",14,155,40);
		
		
		boolean same=mech.equals(mech1);
		
		System.out.println("mechanic name is same :" +same);
		
		System.out.println("mechanic location is same :" +same);
		
		System.out.println("mechanic no of items is same :" +same);
		
		System.out.println("mechanic time taken is same :" +same);
	}

}
