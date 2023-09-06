package com.harshi.jurasipark.app;

public class JuiceServiceimpl implements juiceService {
	
	
	private JuiceServiceimpl juiceRepository;
	
	
	
public JuiceServiceimpl(JuiceServiceimpl juiceRepository) {
	this.juiceRepository=juiceRepository;
}	
	

	@Override
	public void validAndSave(String juice) {
		
		System.out.println("invoking juice name is valid "+ this.getClass().getSimpleName());
		if(juice !=null && !juice.isEmpty() && juice.length()<=7 && juice.length()<=50)
		{
			System.out.println("invoking main in valid juice name");
			if(!this.juiceRepository.isExist(juice){
				this.juiceRepository.validAndSave(juice);
			}
		}
		
		else {
			System.out.println("invoking invalid juice name");
		}
		

	}


	private void isExist(String juice) {
		// TODO Auto-generated method stub
		
	}

}
