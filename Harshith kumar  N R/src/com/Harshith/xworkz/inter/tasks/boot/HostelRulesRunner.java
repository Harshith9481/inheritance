package com.Harshith.xworkz.inter.tasks.boot;

import com.Harshith.xworkz.inter.task.inter.HostelRules;
import com.Harshith.xworkz.inter.tasks.app.Hostel;

public class HostelRulesRunner {
	
	public static void main(String[] args) {
		
		Hostel hst=new HostelRules();
		hst.cleanNess("clean", 18);
		hst.DontUsePhones("jain hst");
		hst.dontWasteFoods("tammotoBath");
		
	}

}
