package com.fortuner.app.repo;

public class AadharDTO {
	
	private String name;
	private long aadharNo;
	private String address;
	private String location;
	
	public AadharDTO()
	{
		
	}
	

	public AadharDTO(String name, long aadharNo, String address, String location) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.location = location;
	}


	@Override
	public String toString() {
		return "AadharDTO [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", location=" + location
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
