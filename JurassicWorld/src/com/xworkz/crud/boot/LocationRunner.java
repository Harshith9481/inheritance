package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.LocationRepository;
import com.xworkz.crud.app.repository.LocationRepositoryimpl;
import com.xworkz.crud.app.service.LocationService;
import com.xworkz.crud.app.service.LocationServiceimpl;

public class LocationRunner {

	public static void main(String[] args) {

		LocationRepository locationRepository=new LocationRepositoryimpl();
		
		LocationService locationService=new LocationServiceimpl(locationRepository);
		locationService.validateAndSave("Shivamogga");
		

	


		
	}

}
