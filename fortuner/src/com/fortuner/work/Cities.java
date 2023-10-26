package com.fortuner.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {
	
	public static void main(String[] args) {
		
		Collection <String> city = new ArrayList();
		city.add("Chikmangaluru");
		city.add("Mangaluru");
		city.add("Bengaluru");
		city.add("Ballari");
		city.add("Haveri");
		city.add("Davangere");
		city.add("chitradurga");
		city.add("Chamarajanagar");
		city.add("Mysore");
		city.add("Hassan");
		city.add("Mandya");
		city.add("Kullbargi");
		city.add("Rahichur");
		city.add("Bidar");
		city.add("Darwad");
		city.add("udupi");
		city.add("uttar kannada");
		city.add("dakshina kannada");
		city.add("vijayapura");
		city.add("harihar");
		city.add("sringeri");
		
		Iterator<String> itr=city.iterator();
		
		while((itr.hasNext())) {
			
			{
				String city1= itr.next();
				System.out.println(city1);
				
				
		}
		}
		
		
	
		
		
		
	}

}
