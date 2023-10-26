package com.fortuner.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {
	
	public static void main(String[] args) {
		
		Collection <String> lap = new ArrayList();
		lap.add("THINKPAD X");
		lap.add("THINKPAD P");
		lap.add("THINKPAD YOGA");
		lap.add("THINKPAD E");
		lap.add("THINKPAD L");
		lap.add("THINKPAD E");
		lap.add("THINKPAD 13");
		lap.add("THINKPAD Y900 SERIES");
		lap.add("THINKPAD 11E");
		lap.add("THINKPAD 300 SERIES");
		lap.add("THINKPAD 700 SERIES");
		lap.add("THINKPAD 100 SERIES");
		lap.add("THINKPAD 410");
		lap.add("THINKPAD 1452");
		lap.add("THINKPAD 4512");
		lap.add("THINKPAD 7105");
		lap.add("THINKPAD 1005");
		lap.add("THINKPAD 7105");
		lap.add("THINKPAD 5105");
		lap.add("YOGA 900 SERIES");
		lap.add("iNSPIRON 14");
		lap.add("G15 GAMMING");
		lap.add("VOSTRO 3520");
		lap.add("INSPIRON 16");
		lap.add("INSPIRON 16");
		lap.add("INSPIRON 18");
		lap.add("INSPIRON 22");
		lap.add("INSPIRON 11234");
		lap.add("INSPIRON 8797");
		lap.add("INSPIRON 654");
		lap.add("INSPIRON 54736");
		lap.add("INSPIRON 577");
		lap.add("INSPIRON 900");
		lap.add("VOSTRO 3550");
		lap.add("VOSTRO 900");
		lap.add("VOSTRO 600");
		lap.add("VOSTRO 300");
		lap.add("11 MACBOOK AIR");
		lap.add("13 MAC BOOK AIR");
		lap.add("NEW 13 MACBOOK");
		lap.add("NEW 15 MACBOOK");
		lap.add("NEW 15 MACBOOK PRO");
		lap.add("NEW 13 MACBOOK PRO");
		lap.add("NEW 15 MACBOOK");
		lap.add("NEW 12 MACBOOK PRO");
		lap.add("NEW 14 MACBOOK");
		lap.add("NEW 17 MACBOOK");
		lap.add("NEW 11 MACBOOK PRO");
		lap.add("INSPIRON 18");
		lap.add("INSPIRON 22");
		lap.add("INSPIRON 11234");
		
		System.out.println("Laptop models of " + lap.size());
		
Iterator<String> itr=lap.iterator();
		
		while((itr.hasNext())) {
			
			{
				String lap1= itr.next();
				System.out.println(lap1);
				
				
		}
		}
		
		
	}

}
