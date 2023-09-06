package com.harshi.jurasipark.app.repository;

public interface JuiceRepository {
	
	
	int TOTAL_BOTTELS=5;
	
	void Store(String names);
	
	 default boolean isExist(String names)
	{
		return false;
	}

}
