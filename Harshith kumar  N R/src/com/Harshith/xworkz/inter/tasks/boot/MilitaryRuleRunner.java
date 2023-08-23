package com.Harshith.xworkz.inter.tasks.boot;

import com.Harshith.xworkz.inter.task.inter.MilitaryRule;
import com.Harshith.xworkz.inter.tasks.app.Military;

public class MilitaryRuleRunner {
	
	public static void main(String[] args) {
		
		Military army=new MilitaryRule();
		army.dontShootWithoutOrder("take order from higher officers");
		army.dontUsePhoneOnDuty("dont use phone on duty");
		army.wearUniform("wear uniform of military");
		
		
		
	}

}
