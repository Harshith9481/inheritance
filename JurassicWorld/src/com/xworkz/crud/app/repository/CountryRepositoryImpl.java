package com.xworkz.crud.app.repository;

public class CountryRepositoryImpl implements CountryRepository {

	private String[] capitals = new String [TOTAL_STATES];
	private int position;
	
	
	
	@Override
	public void city(String capitals) {
		System.out.println("invoking save data" + this.getClass().getSimpleName());
		if(position<TOTAL_STATES)
		{
			this.capitals[position]=capitals;
			System.out.println("Stored " +capitals + " at position" +this.position);
			this.position++;
		}
		else
		{
			System.err.println("country name is invalid");
		}
		
		
	}@Override
	public boolean isExist(String state) {
		for(int index=0;index<this.position;index++)
		{
			String temp = this.capitals[index];
			if(temp!=null && temp.equals(temp));
			{
				System.out.println("country name is already exist...");
				return true;
			}
		}
			
		return false;
	}
		
		
		
		


	}

