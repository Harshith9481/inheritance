package com.Harshith.xworkz.inter.task.inter;

import com.Harshith.xworkz.inter.tasks.app.Temple;

public class TempleRules implements Temple {

	@Override
	public boolean DontSeatInsideTheTemple(String people) {
		System.out.println("invoking main in temple rules to sit inside");
		String rules1 = "dont sit inside temple";
		return true;
	}

	@Override
	public boolean silent(String silence) {
		System.out.println("invoking main in manitain silance");
		String rules2="maintain silance";
		return true;
	}

	@Override
	public boolean dontUsePhones(String phone) {
		System.out.println("invoking main in dont use phones inside the temple");
		String rules3="dont use phones";
		
		return true;
	}

}
