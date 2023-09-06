package com.xworkz.crud.app.repository;

public interface CountryRepository {
	
	int TOTAL_STATES=10;
	
	void city(String capitals);
	
	default boolean isExist(String state) {
		return false;
	}

}
