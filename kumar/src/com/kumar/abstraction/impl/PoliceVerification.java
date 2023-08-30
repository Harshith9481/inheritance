package com.Kumar.Xworkz.inter.impl;

import com.Kumar.Xworkz.abstraction.inter.app.PassportVerification;

public class PoliceVerification implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("invoking main passport verify");
	}

}
