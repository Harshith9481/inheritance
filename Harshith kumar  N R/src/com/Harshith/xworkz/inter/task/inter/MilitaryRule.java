package com.Harshith.xworkz.inter.task.inter;

import com.Harshith.xworkz.inter.tasks.app.Military;

public class MilitaryRule implements Military {

	@Override
	public boolean dontShootWithoutOrder() {
		System.out.println("invoking main in military orders");
		return true;
	}

	@Override
	public boolean dontUsePhoneOnDuty() {
		System.out.println("invoking main in useing about phones");
		return true;
	}

	@Override
	public boolean wearUniform() {
		System.out.println("invoking main in wear uniform");
		return true;
	}

}
