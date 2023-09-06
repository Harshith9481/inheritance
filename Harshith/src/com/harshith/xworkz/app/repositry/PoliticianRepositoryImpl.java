package com.harshith.Xworkz.app.repositry;

public class PoliticianRepositoryImpl implements Politician{
	
	
	String[] names=new String [TOTAL_MLA];
	int positions;

	@Override
	public void cm(String names) {
		System.out.println("invoking main in CM names");
		this.names[positions]= names;
		
		System.out.println("name of" +names +" is position "+this.positions);
		this.positions++;
		
	}

}
