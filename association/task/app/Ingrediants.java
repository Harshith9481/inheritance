package com.association.task.app;

public class Ingrediants {

	public String salt;
	public String water;
	public String flour;
	public String plants;
	public String hydrapd_Silica;


	public Ingrediants(String salt, String water, String flour, String plants, String hydrapd_Silica) {
		super();
		this.salt = salt;
		this.water = water;
		this.flour = flour;
		this.plants = plants;
		this.hydrapd_Silica = hydrapd_Silica;
	}

	public void display() {
		System.out.println(salt);
		System.out.println(water);
		System.out.println(flour);
		System.out.println(plants);
		System.out.println(hydrapd_Silica);
		

	}
}
