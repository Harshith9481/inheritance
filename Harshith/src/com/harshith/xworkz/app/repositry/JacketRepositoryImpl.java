package com.harshith.Xworkz.app.repositry;

public class JacketRepositoryImpl implements Jacket{

	String[] pieces=new String [TOTAL_PIECES];
	int position;
	
	@Override
	public void costume(String pieces) {
		System.out.println("invoking main in jacket ");
		this.pieces[position]=pieces;
		
		
		System.out.println("Stored " +pieces +"in position" +this.position);
		this.position++;
	}
	
	
	

}
