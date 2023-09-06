package com.harshith.Xworkz.app.repository.boot;

import com.harshith.Xworkz.app.repositry.HistoricalPlaceRepository;

public class HisoricalPlaceRepositoryRunner {
	
	public static void main(String[] args) {
		
		HistoricalPlaceRepository history=new HistoricalPlaceRepository();
		
		history.location("DataPitta in ckm");
		history.location("Kallathigiri in ckm");
		history.location("Amruthapura temple in ckm");
		history.location("bridge in Nr Pura");
		history.location("Sharada temple in sringeri");
		history.location("Shivmoga");
		history.location("Chitadurga");
		history.location("patadakallu");
		history.location("Shrirangapatanna");
		history.location("dandelli");
		
		
		
		
	}
	
	

}
