package com.inheritance.chaning.Router.app;



public class EdgeRouter extends Router{

	
		
		public EdgeRouter()
		{
			this("Airtel","hostel",8990,true);
			System.out.println("no-args const of Sunrise");
		}	
		
		public EdgeRouter(String name,String location,int cost,boolean working)
		{
			super(name,location,cost,working);
			System.out.println("All-arg cinst of Sunrise..");
		}
	}

