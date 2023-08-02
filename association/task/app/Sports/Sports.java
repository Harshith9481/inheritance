package com.association.task.app.Sports;

public class Sports {
	
	
	public String name;
	public Player[] player;
	
	public Sports(String name,Player[] player)
	{
	this.player=player;
	this.name=name;
	}
	public void printInfo()
	{
	System.out.println("info of Sports");
	
	System.out.println("name of sports" +this.name);
	for(int size=0;size<player.length;size++)
	{
		System.out.println("player details are been mentioned");
		Player ref=this.player[size];
		
		ref.printInfo();
	}
	System.out.println("name of player" +this.name);
	}
	
	
	
	
	

}
