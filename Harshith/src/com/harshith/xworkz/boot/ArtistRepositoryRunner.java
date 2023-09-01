package com.harshith.Xworkz.boot;

import com.harshith.Xworkz.app.repositry.Artist;
import com.harshith.Xworkz.app.repositry.ArtistRepositoryImpl;

public class ArtistRepositoryRunner {
	
	public static void main(String[] args) {
		
	
	
	Artist kalavida=new ArtistRepositoryImpl();
	
	kalavida.movie("dr.vishnuvardan");
	kalavida.movie("dr.rajkumar");
	kalavida.movie("Shivrajkumar");
	kalavida.movie("darshan");
	kalavida.movie("dr.punith rajkumar");
	kalavida.movie("vijay");
	kalavida.movie("rajini");
	kalavida.movie("surya");
	kalavida.movie("mahesh babu");
	kalavida.movie("vinay hs");
	
	}

}
