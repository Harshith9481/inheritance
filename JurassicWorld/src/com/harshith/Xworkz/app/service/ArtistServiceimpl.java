package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repositry.Artist;
import com.harshith.Xworkz.app.repositry.ArtistRepositoryImpl;

public class ArtistServiceimpl implements ArtistService {
	
	
	private Artist artist;
	
	
	public ArtistServiceimpl(Artist artist)
	{
		this.artist=artist;
	}
	


	@Override
	public boolean movie(String names) {
		System.out.println("invoking validate and save "+ this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=0 && names.length()>=3)
		{
			System.out.println("artist name is valid..");
			this.artist.movie(names);
		}
		else
		{
			System.out.println("artist name is invalid ,cannot save...");
		}
		
		
		return false;
	}

}
