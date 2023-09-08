package com.fortuner.boot;

import com.fortuner.app.repo.NewspaperDTO;
import com.fortuner.app.repo.NewspaperRepository;
import com.fortuner.app.repo.NewspaperRepositoryImpl;
import com.fortuner.service.impl.NewspaperService;
import com.fortuner.service.impl.NewspaperServiceImpl;

public class NewspaperRunner {
	
	public static void main(String[] args) {
		
		NewspaperRepository news = new NewspaperRepositoryImpl();
		
		NewspaperService service = new NewspaperServiceImpl(news);
		
		NewspaperDTO dto = new NewspaperDTO();
		
		service.validateAndSave(dto);
		
		
	}

}
