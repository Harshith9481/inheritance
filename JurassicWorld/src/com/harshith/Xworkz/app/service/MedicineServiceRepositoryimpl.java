package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repositry.MedicineRepositoryImpl;

public class MedicineServiceRepositoryimpl implements MedicineService {

	private MedicineRepositoryImpl medicineRepository;
	
	public medicineRepository(MedicineRepository medicineRepository)
	
	{
		this.medicineRepository=medicineRepository;
		
	}
	
	
	
	
	@Override
	public boolean tablet(String names) {
		System.out.println("invoking names is valid and save" + this.getClass().getSimpleName());
		if(names!=null && names.isEmpty() && names.length()>=0 && names.length()>=9);
		{
			System.out.println("invoking medicine are valid");
			this.medicineRepository.tablet(names);
		}
		else {
			System.out.println("invoking medicine are invalid");
		}
		return false;
	}

}
