package com.inheritance.MethodOverloading.Ticket.app;

public class GeneralTicket extends Ticket{
	
	public GeneralTicket()
	{
		System.out.println("invoking main in general ticket");
	}
	
	@Override
	public void recipt()
	{
		System.out.println("invoking main in recipt");
	}

}
