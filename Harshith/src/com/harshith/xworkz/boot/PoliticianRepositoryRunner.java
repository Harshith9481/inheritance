package com.harshith.Xworkz.boot;

import com.harshith.Xworkz.app.repositry.Politician;
import com.harshith.Xworkz.app.repositry.PoliticianRepositoryImpl;

public class PoliticianRepositoryRunner {
	
	public static void main(String[] args) {
		
		Politician commenMan=new PoliticianRepositoryImpl();
		
		commenMan.cm("KC reddy");
		commenMan.cm("k Hanumanthaiah");
		commenMan.cm("K Manjappa");
		commenMan.cm("S Nijanigappa");
		commenMan.cm("B D Jatti");
		commenMan.cm("S R Kanthi");
		commenMan.cm("Verendra patil");
		commenMan.cm("D devraj urs");
		commenMan.cm("HD kumaraswamy");
		commenMan.cm("BS yeddyurappa");
		
		
		
	}

}
