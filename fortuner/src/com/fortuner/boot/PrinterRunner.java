package com.fortuner.boot;

import com.fortuner.app.repo.PrinterDTO;
import com.fortuner.app.repo.PrinterRepository;
import com.fortuner.app.repo.PrinterRepositoryImpl;
import com.fortuner.service.PrinterService;
import com.fortuner.service.impl.PrinterServiceImpl;

public class PrinterRunner {
	
	public static void main(String[] args) {
		
		PrinterRepository printerRepositor=new PrinterRepositoryImpl();
		
		PrinterService printerService = new PrinterServiceImpl(printerRepositor);
		
		PrinterDTO dto = new PrinterDTO("canon","MT360",741,"bluetooth" );
		
		printerService.validateAndSave(dto);
		
	}

}
