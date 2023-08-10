package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.whatsapp.GitHub;

public class GitHubRunner {
	public static void main(String[] args) {
		
		GitHub hub=new GitHub();
		
		hub.parent("microsoft");
		hub.setlunched("dec");
		hub.setavailable("English");
		hub.setsite("Collaboration");
		hub.setfounder("Tom preston werner");
		hub.setheadquarter("california");
		hub.setindustry("collaboration");
		hub.setrevenue(12);
		hub.setemployee(2500);
		hub.seturl("github.com");
		hub.setstatus("active");
		hub.setregistration("optional");
		hub.setareaserved("worldwide");
		hub.setyearused(15);
		
		
		System.out.println(hub.getavailable());
		System.out.println(hub.getparent());
		System.out.println(hub.getlunched());
		System.out.println(hub.getsite());
		System.out.println(hub.getfounder());
		System.out.println(hub.getheadquarters());
		System.out.println(hub.getindustry());
		System.out.println(hub.getrevenue());
		System.out.println(hub.getemployee());
		System.out.println(hub.geturl());
		System.out.println(hub.getregistration());
		System.out.println(hub.getareaServed());
		System.out.println(hub.getyearUsed());
		
		
		
		
	}

}
