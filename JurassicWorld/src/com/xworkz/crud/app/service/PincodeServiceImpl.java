package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {

	private PincodeRepository pincodeRepository;
	
	public PincodeServiceImpl(PincodeRepository pincodeRepository)
	{
		this.pincodeRepository=pincodeRepository;
	}
	
	
	@Override
	public boolean validateAndSave(int pin) {
		System.out.println("invoking validate and save" +this.getClass().getSimpleName());
		if(pin !=0 && pin >=57713 && pin<=9999999)
		{
			System.out.println("pincode is valid");
			if(!this.pincodeRepository.isExist(pin));
			{
				this.pincodeRepository.nrpura(pin);
				return true;
			}
		}
		else {
			System.err.println("pincode is invalid, cannot save");
		}
		return false;
	}

}
