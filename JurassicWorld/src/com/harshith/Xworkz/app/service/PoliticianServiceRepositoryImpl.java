package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repositry.Politician;

;

public class PoliticianServiceRepositoryImpl implements PoliticianService {

	
	private Politician politicion;
	
	public PoliticianServiceRepositoryImpl(Politician politicion)
	{
		this.politicion=politicion;
	}
	
	@Override
	public boolean cm(String names) {
		System.out.println("Politician names is valid and save" + this.getClass().getSimpleName());
		if(names!=null && names.isEmpty() && names.length()>=0 && names.length()>=18)
		{
			System.out.println("invoking politicion name is valid");
		}
		else {
			System.out.println("invoking politician name is invalid");
		}
		return false;
	}

}
