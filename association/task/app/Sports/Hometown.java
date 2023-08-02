package com.association.task.app.Sports;

public class Hometown {

	public String name;
	public int pincode;
	public Area[] area;

	public Hometown(String name, int pincode, Area[] area) {
		this.name = name;
		this.pincode = pincode;
		this.area = area;

	}

	public void printInfo() {
		System.out.println("info of hometown");

		System.out.println("name of town" + name);
		System.out.println("pincode" + pincode);
		for (int size = 0; size < area.length; size++) {
			Area ref = this.area[size];
			ref.printInfo();
		}
	}

}
