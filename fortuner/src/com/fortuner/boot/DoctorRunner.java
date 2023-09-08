package com.fortuner.boot;

import com.fortuner.app.repo.DoctorDTO;
import com.fortuner.app.repo.DoctorRepository;
import com.fortuner.app.repo.DoctorRepositoryImpl;
import com.fortuner.service.DoctorService;
import com.fortuner.service.impl.DoctorServiceImpl;

public class DoctorRunner {
	public static void main(String[] args) {
		
	
	
	DoctorRepository doctor = new DoctorRepositoryImpl();
	
	DoctorService service = new DoctorServiceImpl(doctor);
	
	DoctorDTO dto = new DoctorDTO("dr.prasanna","sharada clinic",26,"General clinic type");
	
	service.validateAndSave(dto);

}
	}
