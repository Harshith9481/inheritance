package com.fortuner.app.repo;

public class PrinterDTO {
	
	
	private String name;
	private String model;
	private int noOfPages;
	private String type;
	
	
	public void PrintDTO()
	{
		
	}


	public PrinterDTO(String name, String model, int noOfPages, String type) {
		super();
		this.name = name;
		this.model = model;
		this.noOfPages = noOfPages;
		this.type = type;
	}


	@Override
	public String toString() {
		return "PrinterDTO [name=" + name + ", model=" + model + ", noOfPages=" + noOfPages + ", type=" + type + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getNoOfPages() {
		return noOfPages;
	}


	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
