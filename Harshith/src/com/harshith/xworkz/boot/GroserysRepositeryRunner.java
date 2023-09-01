package com.harshith.Xworkz.boot;

import com.harshith.Xworkz.app.repositry.Groceryes;
import com.harshith.Xworkz.app.repositry.GroceryesRepositoryImpl;

public class GroserysRepositeryRunner {
	public static void main(String[] args) {
		
	
	
	Groceryes repo=new GroceryesRepositoryImpl();
	repo.save("Chikan masala");
	repo.save("Ginger Paste");
	repo.save("egg");
	repo.save("rassam powder");
	repo.save("rise");
	repo.save("oil");
	repo.save("sugar");
	repo.save("salt");
	repo.save("gee");
	repo.save("pickels");

	}
}
