package com.harshith.Xworkz.app.repository.boot;

import com.harshith.Xworkz.app.repositry.Patient;
import com.harshith.Xworkz.app.repositry.PatientRepositoryImpl;

public class PatientReposioryRunner {
	
	public static void main(String[] args) {
		
		Patient nurse=new PatientRepositoryImpl();
		
		nurse.wards(123);
		nurse.wards(145);
		nurse.wards(125);
		nurse.wards(126);
		nurse.wards(236);
		nurse.wards(1456);
		nurse.wards(784);
		nurse.wards(456);
		nurse.wards(321);
		nurse.wards(741);
		
		
		
	}

}
