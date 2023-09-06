package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repositry.Pilot;
import com.harshith.Xworkz.app.repositry.PilotRepository;

public class PilotServiceReposioryImpl implements PilotService {

	
	private Pilot pilot;
	
	public PilotServiceReposioryImpl(Pilot pilot)
	{
		this.pilot=pilot;
	}
	
	
	
	@Override
	public boolean driver(String trainNo) {
		System.out.println("pilot trainNo is valid "+ this.getClass().getSimpleName());
		if(trainNo !=null && trainNo.isEmpty() && trainNo.length()>=0 && trainNo.length()>=41)
		{
			System.out.println("invoking in train number is valid");
		}
		else {
			System.out.println("invoking in train number is invalid");
		}
		return false;
	}

}
