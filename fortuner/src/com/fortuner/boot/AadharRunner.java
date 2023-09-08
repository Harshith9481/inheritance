package com.fortuner.boot;

import com.fortuner.app.repo.AadharDTO;
import com.fortuner.app.repo.AadharRepository;
import com.fortuner.app.repo.AadharRepositoryImpl;
import com.fortuner.service.AadharService;
import com.fortuner.service.impl.AadharServiceImpl;

public class AadharRunner {
	public static void main(String[] args) {
		AadharRepository aadharRepository=new AadharRepositoryImpl();
		
		AadharService aadharService= new AadharServiceImpl(aadharRepository);
		
		AadharDTO dto = new AadharDTO("vinay hs",5089250582017894l,"kk main road anaveri","shivamogga");
		
		aadharService.validateAndSave(dto);
	}
	
	

}
