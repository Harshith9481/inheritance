package com.harshith.Xworkz.app.repositry;

public class ArtistRepositoryImpl implements Artist{

	String[] names=new String [TOTAL_NAMES];
	int position;
	
	
	@Override
	public void movie(String names) {
		System.out.println("invoking main in artist from film industrys");
		this.names[position]=names;
		System.out.println("Stored "+ names +"is a position" + this.position);
		this.position++;


		
	}

}
