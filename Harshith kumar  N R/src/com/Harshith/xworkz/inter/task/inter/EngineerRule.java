package com.Harshith.xworkz.inter.task.inter;

import com.Harshith.xworkz.inter.tasks.app.Engineer;

public class EngineerRule implements Engineer {

	@Override
	public boolean onTime() {
		System.out.println("invoking main in on time complete our work");
		return true;
	}

	@Override
	public boolean lessCost() {
		System.out.println("invoking in completion work in less amount");
		return false;
	}

	@Override
	public boolean dimensioning() {
		System.out.println("invoking in good dimensioning ");
		return true;
	}

}
