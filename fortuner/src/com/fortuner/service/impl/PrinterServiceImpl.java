package com.fortuner.service.impl;

import com.fortuner.app.repo.PrinterDTO;
import com.fortuner.app.repo.PrinterRepository;
import com.fortuner.service.PrinterService;

public class PrinterServiceImpl implements PrinterService {

	private PrinterRepository printerRepository;
	
	public PrinterServiceImpl(PrinterRepository printerRepository)
	{
		this.printerRepository=printerRepository;
	}
	
	
	
	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("running printer name is valid " + this.getClass().getSimpleName());
		
		if(dto !=null)
		{
			System.out.println("Printer is valid and save");
			String name=dto.getName();
			String type=dto.getType();
			String model=dto.getModel();
			int noOfPages=dto.getNoOfPages();
			
			if(name !=null)
			{
				System.out.println("printer name is valid can save");
			}
			else {
				System.err.println("printer name is invalid and cannot save");
			}
			if(type !=null)
			{
				System.out.println("printer type is valid can be save");
			}
			else {
				System.err.println("printer type is invalid canot save");
			}
			if(model !=null)

			{
				System.out.println("model in printer is valid can be save");
			}
			else {
				System.err.println("model in printer is invalid and can not save");
			}
			if(noOfPages!=0)
			{
				System.out.println("no of pages are print by printer is valid can save");
			}
			else {
				System.err.println("no of pages are print by printer is invalid cannot be save");
			}
			this.printerRepository.save(dto);
			return true;
	
		}
		else {
			System.err.println("printer is in valid and cannot save");
		}
		return false;
	}

}
