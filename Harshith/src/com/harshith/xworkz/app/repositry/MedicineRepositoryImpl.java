package com.harshith.Xworkz.app.repositry;

public class MedicineRepositoryImpl implements Medicine{

	String[] names=new String[TOTAL_NAMES];
	int position;
	
	
	
	@Override
	public void tablet(String names) {
		System.out.println("invoking main in medicine names ");
		this.names[position]=names;
		
		
		System.out.println("Stored "+ names +"in position" + this.position);
		this.position++;
		
	}

}
