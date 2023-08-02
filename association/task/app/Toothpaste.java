package com.association.task.app;

public class Toothpaste {
	public String name;
	public String brand;
	public String company;
	public Ingrediants[] ingrediants;
	public Company companys;

	public Toothpaste(String name, String brand, Company companys, String company, Ingrediants ingrediants[]) {
		this.name = name;
		this.brand = brand;
		this.company = company;
		this.ingrediants = ingrediants;
		this.companys = companys;
	}

	public void printinfo() {
		System.out.println("info of toothpaste");
		System.out.println("name of paste" + this.name);
		System.out.println("brand of paste" + this.brand);
		System.out.println("Company of paste" + this.company);
		if (ingrediants != null) {
			for (int i = 0; i < ingrediants.length; i++) {
				ingrediants[i].display();
				companys.printinfo();

			}
		} else {
			System.err.println("ingreadiants is empty");
		}

	}

}
