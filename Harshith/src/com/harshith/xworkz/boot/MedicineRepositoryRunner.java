package com.harshith.Xworkz.boot;

import com.harshith.Xworkz.app.repositry.Medicine;
import com.harshith.Xworkz.app.repositry.MedicineRepositoryImpl;

public class MedicineRepositoryRunner {
	
	
	public static void main(String[] args) {
		
	Medicine ontment=new MedicineRepositoryImpl();
	
	
	ontment.tablet("Dolo650");
	ontment.tablet("sitozin");
	ontment.tablet("dart");
	ontment.tablet("Acetaminophen");
	ontment.tablet("Azithromycin");
	ontment.tablet("Aspirin");
	ontment.tablet("Ibuprofen");
	ontment.tablet("Beta blocker");
	ontment.tablet("Doxycycline");
	ontment.tablet("Abacavir");
	
	
	}
}
