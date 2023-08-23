package com.Harshith.xworkz.inter.tasks.boot;

import com.Harshith.xworkz.inter.tasks.app.Engineer;

public class EngineerRuleRunner {
	
	
	public static void main(String[] args) {
		
		Engineer engineer=new EngineerRule();
		engineer.dimensioning("good dimension");
		engineer.onTime("completion work ontime");
		engineer.lessCost("less cost");
		
		
	}

}
