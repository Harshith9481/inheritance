package com.inheritance.MethodOverloading.AllInOne.app;

import com.inheritance.MethodOverloading.Amoeba.app.Swiming;
import com.inheritance.MethodOverloading.Dinosaur.app.BigBody;
import com.inheritance.MethodOverloading.Drum.app.Collect;
import com.inheritance.MethodOverloading.Flex.app.Banner;
import com.inheritance.MethodOverloading.Gate.app.Protection;
import com.inheritance.MethodOverloading.Mic.app.Amplifier;
import com.inheritance.MethodOverloading.Ticket.app.GeneralTicket;
import com.inheritance.MethodOverloading.theater.app.Sound;

import m.inheritance.MethodOverloading.Coal.app.Fire;

public class AllInOne {
	
	public static void main(String[] args) {
		
		{
		Protection protection=new Protection();
		protection.design();
		}
		
		{
			System.out.println(".......................................");
		Fire fire=new Fire();
		fire.heat();
		}
		{
			System.out.println(".......................................");
			BigBody bigbody=new BigBody();
			bigbody.hunt();
		}
		
		{
			System.out.println(".......................................");
			Swiming swiming=new Swiming();
			swiming.shape();
								
		}
		
		{
			System.out.println(".......................................");
			Banner banner=new Banner();
			banner.invite();
		}
		
		{
			System.out.println(".......................................");
			Amplifier fire=new Amplifier();
			fire.signal();
		}
		
		{
			System.out.println(".......................................");
			Collect collect=new Collect();
			collect.Store();
		}
		
		{
			System.out.println(".......................................");
			Sound sound=new Sound();
			sound.film();
			
		}
		{
			System.out.println(".......................................");
			GeneralTicket ticket=new GeneralTicket();
			ticket.recipt();
		}
	
	}

}
