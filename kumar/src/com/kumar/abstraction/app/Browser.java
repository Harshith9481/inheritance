package com.Kumar.Xworkz.abstraction.app;

import com.Kumar.Xworkz.abstraction.inter.app.Internet;

public class Browser {
	
	private Internet internet;
	
	public void setInternet(Internet internet)
	{
	this.internet=internet;
	}
		
	public void connect()
	{
		System.out.println("invoking main to connect the browser");
		this.internet.connect();
	}
	
	
		

}



