package com.Kumar.Xworkz.inter.impl;

import com.Kumar.Xworkz.abstraction.inter.app.Internet;

public class CromeBrowser implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking main in internet connect with crome");

	}

}
