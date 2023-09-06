package com.xworkz.crud.app.repository;

public interface PincodeRepository {
	
	int TOTAL_CITY=8;
	
	void nrpura(int city);
	
	default boolean isExist(int names)
	{
		return false;
	}

}
