package com.harshith.Xworkz.app.service;

import com.harshith.Xworkz.app.repository.boot.GroserysRepositeryRunner;

public class GroserysServiceimpl implements GroserysService {

	private GroserysRepositeryRunner groserysRepository;
	
	public GroserysServiceimpl(GroserysRepositeryRunner groserysRepository)
	{
		this.groserysRepository=groserysRepository;
	}
	
	
	
	@Override
	public boolean save(String items) {
		System.out.println("invoking validation and save "+ this.getClass().getSimpleName());
		if(items!=null && !items.isEmpty() && items.length()>=0 && items.length()>=8)
		{
			System.out.println("grosery name is valid ");
			this.groserysRepository.save(items);	
			}
		else {
			System.out.println("groserys names is invalid ,cannot save");
		}
		return false;
	}

}
