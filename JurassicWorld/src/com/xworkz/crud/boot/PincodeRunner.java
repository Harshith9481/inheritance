3package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PincodeRepository;
import com.xworkz.crud.app.repository.PincodeRepositoryImpl;
import com.xworkz.crud.app.service.PincodeService;
import com.xworkz.crud.app.service.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {
		
		PincodeRepository pincodeRepository=new PincodeRepositoryImpl();
		
		PincodeService pincodeServive=new PincodeServiceImpl(pincodeRepository);
		pincodeServive.validateAndSave(577134);
		pincodeServive.validateAndSave(577123);
		pincodeServive.validateAndSave(577132);
		pincodeServive.validateAndSave(577243);
		pincodeServive.validateAndSave(577204);
		
		
	}

}
