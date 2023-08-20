package com.kumar.xworkz.internal.equals.Ceo;

import com.kumar.xworkz.internal.equals.Kalla.Kalla;

public class Ceo {
	
	private String companyName;
	private String name;
	private String location;
	private int exp;
	private int salery;
	private String softwearUsed;
	
	public Ceo()
	{
		System.out.println("invoking main in ceo of company");
	}

	
	public Ceo(String companyName, String name, String location, int exp, int salery, String softwearUsed) {
		super();
		this.companyName = companyName;
		this.name = name;
		this.location = location;
		this.exp = exp;
		this.salery = salery;
		this.softwearUsed = softwearUsed;
	}
	
	
	@Override
	public String toString()
	{
		System.out.println("invoking to String of ceo..");
		return "companyName :" +companyName +"name :" +name +"location :" +location +"exp :" +exp +"salery :" +salery +"softwearUsed :" +softwearUsed;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			System.out.println("obj is equal to Ceo..");
			if(obj instanceof Ceo)
			{
				System.out.println("Obj is instance of Ceo...");
				Ceo ceo=(Ceo)obj;
				if(ceo.companyName.equals(companyName)&&ceo.name.equals(name)&&ceo.location.equals(location)&&ceo.exp==(exp)&&ceo.salery==(salery)&&ceo.softwearUsed.equals(softwearUsed))
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same...");
				}
			}
			else
			{
				System.out.println("obj is not of Ceo..");
			}
		}
		else
		{
			System.out.println("obj is not equal to Ceo..");
		}
		return false;
	}	

}
