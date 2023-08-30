package com.Kumar.Xworkz.inter.impl;

import com.Kumar.Xworkz.abstraction.inter.app.Building;

public class HostelBuild implements Building {

	@Override
	public void constract() {
		System.out.println("invoking main in build the constract");
	}

}
