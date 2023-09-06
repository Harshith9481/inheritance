package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MobileNoRepository;
import com.xworkz.crud.app.repository.MobileNoRepositoryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileRunner {
	
	
	MobileNoRepository mobileRepository = new MobileNoRepositoryImpl();
	
	MobileNoService mobileNoService = new MobileNoServiceImpl(mobileRepository);
	
	mobileNoService.

}
