package com.kumar.xworkz.extarnal.Object.allInOne.boot;

import com.kumar.xworkz.internal.object.Pendant.Pendant;

public class AllInOneRunner {
	
	public static void main(String[] args) {
		Pendant jewellery =new Pendant();
		jewellery.Pendant("Loket","star","caratlane","green",14,"industrys",18,600,1400,"joyalukkas",412547);
	
	
	Pendant jewellery1=new Pendant()
			{
		@Override
		public String toString() {
			
			return super.toString(Pendant);
		
			}
		
		
			}
			
}
