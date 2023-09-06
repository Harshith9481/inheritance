package com.xworkz.crud.app.repository;

public class TrainNoRepositoryImpl implements TrainNoRepository {

	private int[] irctc = new int [TOTAL_NOS];
	private int position;
	
	@Override
	public void coach(int irctc) {
		System.out.println("invoking save data " +this.getClass().getSimpleName());
		if(position<TOTAL_NOS)
		{
			this.irctc[position]=irctc;
			System.out.println("stored " + irctc + "at position" + this.position);
			this.position++;
		}
		else {
			System.err.println("train number is more than total nos...");
		}
	}
		
		@Override
		public boolean isExist(int irctc) {
			for(int index=0;index<this.position;index++)
			{
				int temp=this.irctc[index];
				if(temp==irctc);
				{
					System.out.println("Train nuber is already exist...");
				}
			}
			return false;
		

	}
	

}
