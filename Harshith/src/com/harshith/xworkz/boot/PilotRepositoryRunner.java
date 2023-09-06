package com.harshith.Xworkz.boot;

import com.harshith.Xworkz.app.repositry.Pilot;
import com.harshith.Xworkz.app.repositry.PilotRepository;

public class PilotRepositoryRunner {
	
	
	public static void main(String[] args) {
		
		Pilot drive=new PilotRepository();
		
		drive.driver(006270);
		drive.driver(22817);
		drive.driver(16218);
		drive.driver(16218);
		drive.driver(0655);
		drive.driver(16021);
		drive.driver(16228);
		drive.driver(22686);
		drive.driver(16591);
		drive.driver(16536);
		
		
	}

}
