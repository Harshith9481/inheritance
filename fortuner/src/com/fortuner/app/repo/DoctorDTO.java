package com.fortuner.app.repo;

public class DoctorDTO {
	
	private String name;
	private String clinicName;
	private int exp;
	private String type;
	
	
	public DoctorDTO()
	{
		
	}


	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", clinicName=" + clinicName + ", exp=" + exp + ", type=" + type + "]";
	}
	
	


	public DoctorDTO(String name, String clinicName, int exp, String type) {
		super();
		this.name = name;
		this.clinicName = clinicName;
		this.exp = exp;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getClinicName() {
		return clinicName;
	}


	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	

}
