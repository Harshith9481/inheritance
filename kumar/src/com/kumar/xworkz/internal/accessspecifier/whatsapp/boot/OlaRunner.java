package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.whatsapp.Ola;

public class OlaRunner {
	
	public static void main(String[] args) {
		
		Ola car=new Ola();
		car.settype("Private");
		car.setindustry("Transportation");
		car.setfounded(2010);
		car.setfounder("Bhavish Aggarwal");
		car.setheadquarters("Banglore");
		car.setnoOfLoc(250);
		car.setareaServed("india,australia,new zealand,united kingdom");
		car.setkeyPeople("Bhavish aggarwal,Ankit bhati");
		car.setproducts("Mobile,App,Website");
		car.setservice("Vechicle for hire finacial services");
		car.setrevenue(983);
		car.setnetRevenue(-1116);
		car.setnoOfEmployees(3000);
		car.setwebsite("www.olacabs.com");
		System.out.println("Type :"+car.gettype());
		System.out.println("Industry :"+car.getindustry());
		System.out.println("Founded :"+car.getfounded());
		System.out.println("Founder :"+car.getfounder());
		System.out.println("Headquarters :"+car.getheadquarters());
		System.out.println("No of Location :"+car.getnoOfLoc());
		System.out.println("Area Served :"+car.getareaServed());
		System.out.println("Key people :"+car.getkeyPeople());
		System.out.println("Products :"+car.getproducts());
		System.out.println("Service :"+car.getservice());
		System.out.println("Revenue :"+car.getrevenue());
		System.out.println("Net Revenue :"+car.getnetRevenue());
		System.out.println("No of Employees :"+car.getnoOfEmployees());
		System.out.println("Website :"+car.getwebsite());

	}

}
