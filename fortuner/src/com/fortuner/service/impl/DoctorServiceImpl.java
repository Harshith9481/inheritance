package com.fortuner.service.impl;

import javax.sound.midi.SysexMessage;

import com.fortuner.app.repo.DoctorDTO;
import com.fortuner.app.repo.DoctorRepository;
import com.fortuner.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

	private DoctorRepository doctorRepository;
	
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository=doctorRepository;
	}
	
	
	
	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("Doctor name is valid " + this.getClass().getSimpleName());
		
		
		if(dto !=null)
		{
			System.out.println("DoctorDTO is valid can be save");
			this.doctorRepository=doctorRepository;
		}
			
			System.out.println("Doctor name is valid");
		String name=dto.getName();
		String clinicName=dto.getClinicName();
		int exp=dto.getExp();
		String type=dto.getType();
		
		if(name !=null)
		{
			System.out.println("name is valid ");
		}
		else {
			System.err.println("name is invalid and save");
		}
		if(clinicName !=null)
		{
			System.out.println("clinic name is valid");
		}
		else{
			System.err.println("clinic name is invalid cannot save");
		}
		if(exp!=0)
		{
			System.out.println("expireance is valid and save");
		}
		else{
			System.err.println("experiance is invalid and save");
		}
		if(type !=null)
		{
			System.out.println("type of doctor is treet is valid");
		}
		else{
			System.err.println("type of doctor is invali canot save");
		}
		
			this.doctorRepository.save(dto);
			return true;
	}
		
	else
		{
			System.err.println("Doctor name is invalid ,cannot save");
		}
		
		return false;
	}

}
