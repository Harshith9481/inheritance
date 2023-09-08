package com.fortuner.service;

import com.fortuner.app.repo.AadharDTO;

public interface AadharService {
	
	boolean validateAndSave(AadharDTO dto);

}
