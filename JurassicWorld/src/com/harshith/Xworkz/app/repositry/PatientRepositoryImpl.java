package com.harshith.Xworkz.app.repositry;

public class PatientRepositoryImpl implements Patient{

	String[] patients=new String[TOTAL_PATIENTS];
	int positions;
	
	
	@Override
	public void wards(String patients) {
		System.out.println("invoking main in patients in hospital admited");
		this.patients[positions]=patients;
		System.out.println("Stored "+patients +"in position "+ this.positions);
		this.positions++;
		
	}
	
	

}
