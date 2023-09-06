package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.TrainNoRepository;
import com.xworkz.crud.app.repository.TrainNoRepositoryImpl;
import com.xworkz.crud.app.service.TrainNoService;
import com.xworkz.crud.app.service.TrainNoServiceImpl;

public class TrainNoRunner {
	
	TrainNoRepository trainNoRepository=new TrainNoRepositoryImpl();
	
	TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);
	
	

}
