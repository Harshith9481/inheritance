package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {
	
	private CountryRepository countryRepository;
	
	public CountryServiceImpl(CountryRepository countryRepository)
	{
		this.countryRepository=countryRepository;
	}


	@Override
	public boolean validdateAndSave(String india) {
		System.out.println("invoking validate and save "+ this.getClass().getSimpleName());
		if(india!=null && india.isEmpty() && india.length()>3 && india.length()<30)
		{
			System.out.println("country name is valid");
			if(!this.countryRepository.isExist(india))
			{
				this.countryRepository.city(india);
				return true;
			}
		}
			else {
				System.err.println("contry name is invalid,cannot save ");
			}
		
	
		return false;
}

}
