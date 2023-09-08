package com.fortuner.app.repo;

public class PrinterRepositoryImpl implements PrinterRepository {

	private PrinterDTO[] printer=new PrinterDTO[TOTAL_PAGES];
	private int position;
	
	
	@Override
	public void save(PrinterDTO dto) {

System.out.println("printer is valid and save" +this.getClass().getSimpleName());

if(dto !=null)
{
	System.out.println("printer is valid ");
	this.printer[position]=dto;
	System.out.println(dto);
	this.position++;
}
else {
	System.out.println("printer is invalid ");
}

	}

}
