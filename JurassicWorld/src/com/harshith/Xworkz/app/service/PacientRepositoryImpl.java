package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repositry.PatientRepositoryImpl;

public class PacientRepositoryImpl implements PatientService {

	
	private PatientRepositoryImpl patientRepository;
	
	public Patient(PatientRepository patientRepository)
	{
		this.patientRepository=patientRepository;
	}
	

	@Override
	public boolean wards(String patients) {
		System.out.println("patients in ward is valid" +this.getClass().getSimpleName());
		if(patients !=null && patients.isEmpty() && patients.length()>=0 && patients.length()>=87)SS
		{
			System.out.println("invoking patient in wards are valid ");
			this.patientRepository.wards(patients);
		}
		else {
			System.out.println("invoking patients in wards are invalid ");
		}
		return false;
	}

}
