package com.Kumar.Xworkz.inter.impl;

import com.Kumar.Xworkz.abstraction.inter.app.Building;

public class MallBuild implements Building {

	@Override
	public void constract() {
	System.out.println("invoking main in construct of mall building");
	}

}
