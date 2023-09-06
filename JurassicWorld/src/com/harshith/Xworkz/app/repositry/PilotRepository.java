package com.harshith.Xworkz.app.repositry;

public class PilotRepository implements Pilot{
	
	String[] trainno=new String[TOTAL_TRAIN];
	int position;
	@Override
	public void driver(String trainNo) {
		System.out.println("invoking main in total trian number");
		this.trainno[position]=trainNo;
		
		
		
		System.out.println("Stored "+trainNo +" in position "+this.position);
		this.position++;
		
	}
	
	

}
