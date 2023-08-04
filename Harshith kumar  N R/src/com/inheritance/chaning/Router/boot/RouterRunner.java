package com.inheritance.chaning.Router.boot;

import com.inheritance.chaning.Router.app.EdgeRouter;
import com.inheritance.chaning.Router.app.Router;

public class RouterRunner {
	
	public static void main(String[] args) {
		
		Router role=new Router("jioFiber","hostel",5000,true);
		System.out.println("Brand name :"+role.name);
		System.out.println("location :"+role.location);
		System.out.println("cost :"+role.cost);
		System.out.println("working :"+role.working);
		
		
		EdgeRouter role1=new EdgeRouter();
		System.out.println("Brand name :"+role1.name);
		System.out.println("location :"+role1.location);
		System.out.println("cost :"+role1.cost);
		System.out.println("working :"+role1.working);
	}

}
