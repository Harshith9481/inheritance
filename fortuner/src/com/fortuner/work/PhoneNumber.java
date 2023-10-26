package com.fortuner.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PhoneNumber {
	
	public static void main(String[] args) {
		
		Collection<Long> phone=new ArrayList();
		phone.add(9481904948L);
		phone.add(9481904941L);
		phone.add(9481904942L);
		phone.add(9481904943L);
		phone.add(9481904944L);
		phone.add(9481904945L);
		phone.add(9481904946L);
		phone.add(9481904947L);
		phone.add(9481904948L);
		phone.add(9481904949L);
		phone.add(9481904940L);
		phone.add(9481904911L);
		phone.add(9481904912L);
		phone.add(9481904913L);
		phone.add(9481904914L);
		phone.add(9481904915L);
		phone.add(9481904916L);
		phone.add(9481904917L);
		phone.add(9481904918L);
		phone.add(9481904919L);
		phone.add(94819049420L);
		phone.add(9108238304L);
		phone.add(9449045537L);
		phone.add(9449426632L);
		phone.add(7259758398L);
		phone.add(63635612478L);
		phone.add(9481874512L);
		phone.add(948741258L);
		phone.add(9481904512L);
		phone.add(94819044578L);
		phone.add(9481904456L);
		phone.add(948190494785L);
		
		System.out.println("phone number is :" + phone.size());
		
		Iterator<Long> itr=phone.iterator();
		
		while((itr.hasNext())) {
			
			{
				Long phone1= itr.next();
				System.out.println(phone1);
				
				
		}
		}
		
		
		
	}

}
