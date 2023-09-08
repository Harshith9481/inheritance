package com.fortuner.app.repo;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {
	
	private String publisher;
	private String name;
	private String content;
	private int noOfPages;
	private int cost;
	
	
	public NewspaperDTO()
	{
		
	}


	
	
	
	public NewspaperDTO(String publisher, String name, String content, int noOfPages, int cost) {
		super();
		this.publisher = publisher;
		this.name = name;
		this.content = content;
		this.noOfPages = noOfPages;
		this.cost = cost;
	}





	@Override
	public String toString() {
		return "NewspaperDTO [publisher=" + publisher + ", name=" + name + ", content=" + content + ", noOfPages="
				+ noOfPages + ", cost=" + cost + "]";
	}





	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getNoOfPages() {
		return noOfPages;
	}


	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	

}
