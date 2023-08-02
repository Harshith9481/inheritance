package com.association.task.app;

public class Company {

	public String name;
	public String ceo;
	public String originCountry;

	public Company(String name, String ceo, String originCountry) {
		super();
		this.name = name;
		this.ceo = ceo;
		this.originCountry = originCountry;
	}

	public void printinfo() {
		System.out.println(name);
		System.out.println(ceo);
		System.out.println(originCountry);

	}

}
