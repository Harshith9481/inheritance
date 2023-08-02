package com.association.task.app.Sports;

public class Building {
	public Floor[] floor;
	public Lift[] lift;

	public Building(Floor[] floor, Lift[] lift) {
		this.floor = floor;
		this.lift = lift;

	}

	public void printInfo()

	{
		for (int index = 0; index < floor.length; index++)
		{
			System.out.println("info of building");
		Floor ref = this.floor[index];
		ref.printInfo();
		}
		System.out.println("..............................");
		for (int index = 0; index < lift.length; index++) {
			System.out.println("info of lift details");
			Lift ref = this.lift[index];
			ref.printInfo();
		}
	}

}
