package com.fortuner.work;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

public class River {
	
	public static void main(String[] args) {
		
		Collection<String> work = new ArrayList();
		work.add("yamuna");
		work.add("Krishna");
		work.add("Bhadra");
		work.add("Mallaprabha");
		work.add("TungaBhadra");
		work.add("bindu");
		work.add("ganga");
		work.add("thunga");
		System.out.println(work.toString() + " name of rivers is " + work.size());
		
	Iterator<String> itr=work.iterator();
		
			while((itr.hasNext())) {
				
				{
					String work1= itr.next();
					System.out.println("work");
					
					
			}
			}
			while(itr.addAll()) {
				
			}
			System.out.println(work.remove(work));
			System.out.println(work.addAll(work));
			System.out.println(work.contains(work));
			System.out.println(work.containsAll(work));
			System.out.println(work.removeAll(work));
			//System.out.println(work.clear());
			System.out.println(work.isEmpty());
		}

	
	}
		
		
	


