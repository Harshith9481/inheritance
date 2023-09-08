package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService {

	private TrainNoRepository trainNoRepository;
	
	public TrainNoServiceImpl(TrainNoRepository trainNoRepository)
	{
		this.trainNoRepository= trainNoRepository;
	}
	
	
	@Override
	public boolean validdateAndSave(int station) {
		System.out.println("invoking validate and save "+ this.getClass().getSimpleName());
		if(station !=0 && station<=9999999 && station >=99999)
		{
			System.out.println("Train Number is valid");
			if(!this.trainNoRepository.isExist(station))
			{
				this.trainNoRepository.coach(station);
				return true;
			}
			else {
				System.err.println("train nos is invalid");
			}
			
		}
		else {
			System.err.println("Train nos is invali ,cannot save");
		}
		return false;
	}

}
