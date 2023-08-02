package com.association.task.boot;

import com.association.task.app.Company;
import com.association.task.app.Ingrediants;
import com.association.task.app.Toothpaste;

public class IngreadiantsRunner {

	public static void main(String[] args) {

		System.out.println("Ingreadiants Runner running ");

		Ingrediants ingrediants = new Ingrediants("Asoka", "aqua", "rose", "pinapale", "silicon");
		Ingrediants ingrediants1 = new Ingrediants("Aqua", "bisalari", "lavanga", "apple", "hydra silicon");

		Ingrediants[] ingrediants2 = { ingrediants, ingrediants1 };
		Company company = new Company("Xworkz", "Omkar", "India");

		Toothpaste toothpaste = new Toothpaste("colgate", "salt", company, "Maxfresk", ingrediants2);
		toothpaste.printinfo();
		System.out.println("=======================================================");

	}

}
