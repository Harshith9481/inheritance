package com.harshith.Xworkz.app.repositry;

public class PatientRepositoryImpl implements Patient{

	int[] patients=new int[TOTAL_PATIENTS];
	int positions;
	
	
	@Override
	public void wards(int patients) {
		System.out.println("invoking main in patients in hospital admited");
		this.patients[positions]=patients;
		System.out.println("Stored "+patients +"in position "+ this.positions);
		this.positions++;
		
	}
	
	

}
