package com.kumar.xworkz.internal.equals.Mechanic;

public class Mechanic {

	private String name;
	private String location;
	private String ownerName;
	private int noOfItems;
	private int costPerItem;
	private int timeToRepair;

	public Mechanic() {
		System.out.println("no-args const in Mechanic");
	}

	public Mechanic(String name, String location, String ownerName, int noOfItems, int costPerItem, int timeToRepair) {
		super();
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
		this.noOfItems = noOfItems;
		this.costPerItem = costPerItem;
		this.timeToRepair = timeToRepair;
	}

	@Override
	public String toString() {
		System.out.println("invoking to String of Mechanic..");
		return "name :" + name + "location :" + location + "ownerName :" + ownerName + "noOfItems :" + noOfItems
				+ "costPerItem :" + costPerItem + "timeToRepair :" + timeToRepair;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is equal to null..");
			if (obj instanceof Mechanic) {
				System.out.println("obj is intance of Mechanic..");
				Mechanic koppa = (Mechanic) obj;
				if (koppa.name.equals(this.name) && koppa.location == (location)
						&& koppa.ownerName.equals(this.ownerName) && koppa.noOfItems == (this.noOfItems))

				{
					System.out.println("object and properties is same..");
					return true;

				} else {
					System.out.println("object and properties is  not same..");
					return false;
				}

			} else {
				System.out.println("obj is not of Mechanic..");
			}
		} else {
			System.out.println("obj is not equal to null...");
		}
		return false;

	}

}
