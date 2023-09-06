package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repository.boot.JacketRepositoryRunner;

public class JacketServiceRepositoryimpl implements JacketService {
	
	private JacketRepositoryRunner jacketRepository;
	
	public JacketRepository(JacketRepository jacketRepository)
	{
		
		this.jacketRepository = jacketRepository;
	}
	

	@Override
	public boolean costume(String pieces) {
		
		
		System.out.println("invoking valied and save "+ this.getClass().getSimpleName());
		if(pieces!=null && pieces.isEmpty()&& pieces.length()>=0 && pieces.length()>=0)
		{
			System.out.println("Jacket pieces is valid ");
			this.jacketRepository.costume(pieces);
		}
		else {
			System.out.println("invoking jacket is invalid");
		}
		
		
		
		return false;
	}

}
