package com.xworkz.crud.app.repository;

public interface LocationRepository {
	
	int TOTAL_LOCATION=5;
	
	void save(String location);
	
	default boolean isExist(String location)
	{
		return false;
	}

}
