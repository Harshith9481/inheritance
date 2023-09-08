package com.fortuner.app.repo;

public class DoctorRepositoryImpl implements DoctorRepository{

	private DoctorDTO[] tablets=new DoctorDTO[TOTAL_PASIENTS];
	private int position;
	
	
	
	
	@Override
	public void save(DoctorDTO dto) {
		System.out.println("doctor qualified is valid" + this.getClass().getSimpleName());
		if(dto !=null)
		{
			this.tablets[position]=dto;
			
			System.out.println("doctor qualified is valid ");
			
			this.position++;
		}
		else {
			System.err.println("doctor name is invalid ");
		}
	}

}
