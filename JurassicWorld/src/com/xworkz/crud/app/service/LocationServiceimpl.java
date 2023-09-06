package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.LocationRepository;

public class LocationServiceimpl implements LocationService {

	private LocationRepository locationRepository;
	
	public LocationServiceimpl(LocationRepository locationRepository) {
		this.locationRepository=locationRepository;
		}
	
	@Override
	public boolean validateAndSave(String location) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(location!=null && !location.isEmpty() && location.length()>=3 && location.length()<=20)
		{
			System.out.println("Location name is valid..");
			if(!this.locationRepository.isExist(location))
			{
			this.locationRepository.save(location);
			return true;
			}
			else
			{
				System.err.println("Location name is already eist..");
			}
		}
		else
		{
			System.err.println("Location name is invalid, cannot save");
		}
		return false;
	}

}
