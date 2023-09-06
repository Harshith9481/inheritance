package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.CountryRepositoryImpl;
import com.xworkz.crud.app.service.CountryService;
import com.xworkz.crud.app.service.CountryServiceImpl;

public class CountryRunner {
	
	
	public static void main(String[] args) {
		
		CountryRepository countryRepository=new CountryRepositoryImpl();
		
		CountryService countryService=new CountryServiceImpl(countryRepository);
		
		countryService.validdateAndSave("India");
		countryService.validdateAndSave("usa");
		countryService.validdateAndSave("Canada");
		countryService.validdateAndSave("Nepal");
		countryService.validdateAndSave("Russia");
		
		
	}

}
