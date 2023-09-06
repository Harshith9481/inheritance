package com.harshith.Xworkz.app.repository.boot;

import com.harshith.Xworkz.app.repositry.Artist;
import com.harshith.Xworkz.app.repositry.ArtistRepositoryImpl;
import com.harshith.Xworkz.app.service.ArtistService;
import com.harshith.Xworkz.app.service.ArtistServiceimpl;

public class ArtistRepositoryRunner {
	
	public static void main(String[] args) {
		
		Artist artistRepositoryImpl=new ArtistRepositoryImpl();
		
	
		ArtistService kalavida = new ArtistServiceimpl(artistRepositoryImpl);
	
	
	
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
