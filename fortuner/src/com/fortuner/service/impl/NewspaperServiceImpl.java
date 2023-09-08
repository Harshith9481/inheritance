package com.fortuner.service.impl;

import javax.sound.midi.SysexMessage;

import com.fortuner.app.repo.NewspaperDTO;
import com.fortuner.app.repo.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperRepository newspaperRepository;
	
	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository=newspaperRepository;
	}
	
	
	
	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("newspaper is valid "+this.getClass().getSimpleName());
		if(dto !=null)
		{
			System.out.println("newspaper is valid to save");
			
			String publisher = dto.getPublisher();
			String name = dto.getName();
			String content=dto.getContent();
			int noOfPages=dto.getNoOfPages();
			int cost = dto.getCost();
			
			if(publisher !=null)
			{
				System.out.println("publisher is publish in paper");
			}
			else {
				System.err.println("publisher in not publish in paper invalid");
			}
			if(name!=null)
			{
				System.out.println("name is valid");
				
			}
			else {
				System.err.println("name is not invalid");
			}
			if(content !=null)
			{
				System.out.println("content is valid");
			}
			else {
				System.err.println("content is invalid");
			}
			if(noOfPages !=0)
			{
			System.out.println("no of pages are valid");	
			}
			else {
				System.err.println("no of pages are invalid");
			}
			this.newspaperRepository.save(dto);
			return true;
		}
		else {
			System.err.println("printer dto is invalid can not save");
		}
		return false;
	}

	

}
