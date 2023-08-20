package com.kumar.xworkz.internal.equals.boot;

import com.kumar.xworkz.internal.equals.Sniperr.Sniper;

public class SniperRunner {
	
	
	public static void main(String[] args) {
		
		
		Sniper gun=new Sniper("Sniper","accuracy international","nato.304","bolt-action",120,"shoot");
		
		
		Sniper gun1=new Sniper("AR10T","accuracy international","nato.304","bolt-action",140,"shoot");
		
		
		boolean same=gun.equals(gun1);
		
		System.out.println("Sniper manufacture is same :" +same);
		
		System.out.println("Sniper cartridge is same :" +same);
		
		System.out.println("Sniper is used same :" +same);
	}
	

}
