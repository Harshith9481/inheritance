package com.xworkz.crud.app.repository;

public class LocationRepositoryimpl implements LocationRepository{
	
	private String location[]=new String[TOTAL_LOCATION];
	private int position;
	
	@Override
	public void save(String location) {
		System.out.println("invoking save data "+this.getClass().getSimpleName());
		if(position<TOTAL_LOCATION)
		{
			this.location[position]=location;
			System.out.println("Stored "+location + " at postion "+this.position);
			this.position++;
		}
		else
		{
			System.err.println("location names is more total location..");
		}
	}
	
	@Override
	public boolean isExist(String location) {
		for(int index=0;index<this.position;index++)
		{
			String temp=this.location[index];
			if(temp!=null && temp.equals(temp))
			{
				System.out.println("Location name is already exist...");
			}
		}
		
		return false;
	}

}
