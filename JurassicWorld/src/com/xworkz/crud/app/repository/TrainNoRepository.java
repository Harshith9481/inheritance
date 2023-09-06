package com.xworkz.crud.app.repository;

public interface TrainNoRepository {
	
	int TOTAL_NOS=10;
	
	void coach(int irctc);
	
	default boolean isExist(int names)
	{
		return false;
	}


}
