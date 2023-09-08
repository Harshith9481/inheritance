package com.fortuner.app.repo;

public class NewspaperRepositoryImpl implements NewspaperRepository {

	private NewspaperDTO[] newspaper = new NewspaperDTO[TOTAL_PAGES];
	
	private int position;
	
	
	
	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("running newspaper is running" + this.getClass().getSimpleName());
		
		if(dto!=null)
		{
			this.newspaper[position]=dto;
			System.out.println("Newspaper is valid");
			this.position++;
		}
		else {
			System.err.println("newspaper is in valid and cannot save");
		}
	}

}
