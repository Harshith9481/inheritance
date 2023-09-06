package com.xworkz.crud.app.repository;

public class PincodeRepositoryImpl implements PincodeRepository {

	private int[] city=new int [TOTAL_CITY];
	private int position;
	
	
	@Override
	public void nrpura(int city) {
		System.out.println("invoking save data "+ this.getClass().getSimpleName());
		if(position<TOTAL_CITY)
		{
			this.city[position]=city;
			System.out.println("Stored "+ city + " at position "+this.position);
			this.position++;
		}
		else {
			System.err.println("city name is more than total city");
			
		}
	}
		@Override
		public boolean isExist(int city) {
			for(int index=0;index<this.position;index++)
			{
				int temp=this.city[index];
				if(temp!=0 && temp==city);
				{
					System.err.println("pincode name is already exist...");
					return true;
				}
			}
			return false;
		

	}

}
