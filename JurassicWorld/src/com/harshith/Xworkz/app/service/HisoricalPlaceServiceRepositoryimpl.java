package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repositry.HistoricalPlaceRepository;

public class HisoricalPlaceServiceRepositoryimpl implements HisoricalPlaceService {

	private HistoricalPlaceRepository historicalPlaceRepository;
	
	public  HistoricalPlaceRepository(HistoricalPlaceRepository historicalPlaceRepository)
	{
		this.historicalPlaceRepository=historicalPlaceRepository;
	}
	
	@Override
	public boolean location(String places) {
		System.out.println("places is valid and save "+ this.getClass().getSimpleName());
		if (places ! =null && places.isEmpty() && places.length()>=0 && places.length()>=8)
		{
			System.out.println("invoking historical places is valid ");
			this.historicalPlaceRepository=historicalPlaceRepository;
		}
		else {
			System.out.println("invoking historical places are invalid");
		}
		
		return false;
	}

}
