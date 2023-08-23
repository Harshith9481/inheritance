package com.Harshith.xworkz.inter.tasks.boot;

import com.Harshith.xworkz.inter.task.inter.TempleRules;
import com.Harshith.xworkz.inter.tasks.app.Temple;

public class TempleRuleRunner {
	
	public static void main(String[] args) {
		
		Temple god=new TempleRules();
		god.DontSeatInsideTheTemple("public");
		god.dontUsePhones("prohibated");
		god.silent("Maintain Silence");
		
		
		
	}
	

}
