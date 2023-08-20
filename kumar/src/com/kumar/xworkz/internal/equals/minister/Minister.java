package com.kumar.xworkz.internal.equals.minister;



public class Minister {
	
	
	private String name;
	private int period;
	private String vidanasabaKshetra;
	private String partyName;
	
	
	public Minister()
	{
		System.out.println("no-args const by ministers....");
	}


	
	public Minister(String name, int period, String vidanasabaKshetra, String partyName) {
		super();
		this.name = name;
		this.period = period;
		this.vidanasabaKshetra = vidanasabaKshetra;
		this.partyName = partyName;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			System.out.println("obj is equal to null..");
			if(obj instanceof Minister)
			{
				System.out.println("obj is intance of Cook..");
				Minister koppa=(Minister)obj;
				if(koppa.name.equals(this.name)&&koppa.period==(period)&&koppa.vidanasabaKshetra.equals(this.vidanasabaKshetra)&&koppa.partyName.equals(this.partyName));
				{
					System.out.println("object and properties is same..");
				}
				else
				{
					System.out.println("object and properties is not same..");
				}	
			}
			else
			{
				System.out.println("obj is not of Minister..");
			}
		}
		else
		{
			System.out.println("obj is not equal to null...");
		}

	return false;
	}
	
}
