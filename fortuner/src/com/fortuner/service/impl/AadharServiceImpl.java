package com.fortuner.service.impl;

import com.fortuner.app.repo.AadharDTO;
import com.fortuner.app.repo.AadharRepository;
import com.fortuner.service.AadharService;

public class AadharServiceImpl implements AadharService {

	private AadharRepository aadharRepository;
	
	public AadharServiceImpl(AadharRepository aadharRepository)
	{
		this.aadharRepository=aadharRepository;
	}
	

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("Aadhar name is valid " +this.getClass().getSimpleName());
		
		if(dto !=null)
	
		{
			System.out.println("aadhar number is valid and save....");
			String name=dto.getName();
			long aadharNo=dto.getAadharNo();
			String location=dto.getLocation();
			String address=dto.getAddress();
			
			if(name !=null)
			{
				System.out.println("name is valid and save...");
			}
			else {
				System.out.println("name is invalid , cannot save...");	
			}
			
			if(aadharNo !=0)
			{
				System.out.println("Aadhar number is valid and save...");
			}
			else {
				System.out.println("Aadhar number is invalid , cannot save...");	
			}
			if(location !=null)
			{
				System.out.println("location is valid and save...");
			}
			else {
				System.out.println("location is invalid , cannot save...");	
			}
			if(address != null)
			{
				System.out.println("Address is valid");
			}
			else {
				System.err.println("address is invalid cannot save");
			}
			
			this.aadharRepository.save(dto);
			return true;
		}
		else
		{
			System.err.println("aadhar nuber is invalid ....");
		}
		
	return false;
	}

}
