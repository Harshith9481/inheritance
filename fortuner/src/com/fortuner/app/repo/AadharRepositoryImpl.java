package com.fortuner.app.repo;

public class AadharRepositoryImpl implements AadharRepository {
	
	private AadharDTO[] status = new AadharDTO[TOTAL_NAMES];
	
	private int position;

	@Override
	public void save(AadharDTO dto) {
		System.out.println("aadhar name is save " + this.getClass().getSimpleName());
		if(position<TOTAL_NAMES)
		{
			this.status[position]=dto;
			System.out.println(dto);
			this.position++;
		}
		else
		{
			System.err.println("aadhar name cannot be save..");
			
		}
		
	}
	
	
	
	

}
