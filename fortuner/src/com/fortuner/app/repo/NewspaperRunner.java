package com.fortuner.app.repo;

import com.fortuner.service.impl.NewspaperService;
import com.fortuner.service.impl.NewspaperServiceImpl;
import com.xworkz.jingalala.repo.NewspaperRepository;

public class NewspaperRunner {

	public static void main(String[] args) {
		
		NewspaperRepository repo=new NewspaperRepository();
		
		NewspaperService service = new NewspaperServiceImpl(repo);
		
		NewspaperDTO dto = new NewspaperDTO();
		
		service.validateAndSave(repo);
		
		
		
		
	}

}
