package com.fortuner.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndianStates {
	
	public static void main(String[] args) {
		
		Collection <String> states= new ArrayList();
		states.add("Andhra Pradesh");
		states.add("Assam");
		states.add("Bihar");
		states.add("Chhattisgarh");
		states.add("Goa");
		states.add("Gujarat");
		states.add("Haryana");
		states.add("Himachal Pradesh");
		states.add("Jharkhand");
		states.add("Madhya Pradesh");
		states.add("Karnataka");
		states.add("Kerala");
		states.add("Maharashtra");
		states.add("Manipur");
		states.add("Mizoram");
		states.add("Meghalaya");
		states.add("Nagaland");
		states.add("Punjab");
		states.add("Sikkim");
		states.add("Rajasthan");
		states.add("Odisha");
		states.add("Tamil Nadu");
		states.add("Tripura");
		states.add("Telangana");
		states.add("Uttarakhand");
		states.add("Uttar Pradesh");
		states.add("West Bengal");
		states.add("Meghalaya");
		states.add("Mizoram");
		System.out.println("indian states name " + states.size());
		
		
		Iterator<String> itr=states.iterator();
		
		while((itr.hasNext())) {
			
			{
				String states1= itr.next();
				System.out.println(states1);
				
				
		}
		}
		
		
		
	}

}
