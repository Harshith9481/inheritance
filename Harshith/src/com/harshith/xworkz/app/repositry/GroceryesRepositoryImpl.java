package com.harshith.Xworkz.app.repositry;

public class GroceryesRepositoryImpl implements Groceryes{

	
	String[] items=new String[TOTAL_ITEM];
	int position;
	
	
	@Override
	public void save(String items) {
		System.out.println("invoking save in grocerys repositery");
		this.items[position]=items;
		System.out.println("stored "+items +" in position "+this.position);
		this.position++;
		
		
	}
	

}
