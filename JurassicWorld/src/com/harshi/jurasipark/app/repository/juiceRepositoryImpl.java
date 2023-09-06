package com.harshi.jurasipark.app.repository;

public class juiceRepositoryImpl implements JuiceRepository {

	private String[] juices = new String[TOTAL_BOTTELS];
	private int position;

	@Override
	public void Store(String names) {
		System.out.println("invoking in juice " + this.getClass().getSimpleName());
		if (position < TOTAL_BOTTELS) {
			this.juices[position] = names;
			System.out.println("Stored " + juices + " at postion " + this.position);
			this.position++;
		} else {
			System.out.println("invoking juice name invalid");
		}

	}
	@Override
	public boolean isExist(String names) {
		for(int index=0;index<this.position;index++)
		{
			String temp=this.juices[index];
			if(temp!=null && temp.equals(temp))
			{
				System.out.println("Juice name is already exist..");
			}
		}
		
		
		return false;
	}

}
