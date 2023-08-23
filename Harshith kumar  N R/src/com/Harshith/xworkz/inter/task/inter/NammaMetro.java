package com.Harshith.xworkz.inter.task.inter;

import com.Harshith.xworkz.inter.tasks.app.Metro;

public class NammaMetro implements Metro {

	@Override
	public boolean dontAllowTheLiquorBottel(String bottels) {
		System.out.println("it do not allows any liquor bottels in metro");
		bottels="drinks,juiceBottels";
		System.out.println("bottels :"+bottels);
		return false;
	}

	@Override
	public boolean dontAllowSharpMetals(String metals,String items) {
		System.out.println("it do not allows any sharp edges matirials");
		metals="kniff";
		items="huge items";
		System.out.println("metals :"+metals);
		System.out.println("items :"+items);

		return false;
	}

	@Override
	public boolean allowsOnlyCardOrTokan(int payRupees,String cardName,int time) {
		System.out.println("it have some rules to pay amount to get entering the metro");
		payRupees=35;
		cardName="Namma metro";
		time=14;
		System.out.println("payRupees :"+payRupees);
		System.out.println("cardName :"+cardName);
		System.out.println("time :"+time);
		return true;
	}

}
