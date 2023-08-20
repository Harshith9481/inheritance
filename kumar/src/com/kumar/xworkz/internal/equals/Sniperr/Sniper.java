package com.kumar.xworkz.internal.equals.Sniperr;



public class Sniper {
	
	private String name;
	private String manufacture;
	private String cartridge;
	private String action;
	private int noOfBullets;
	private String used;
	
	
	public Sniper()
	{
		System.out.println("no-args const in about sniper");
	}


	
	public Sniper(String name, String manufacture, String cartridge, String action, int noOfBullets, String used) {
		super();
		this.name = name;
		this.manufacture = manufacture;
		this.cartridge = cartridge;
		this.action = action;
		this.noOfBullets = noOfBullets;
		this.used = used;
	}
	
	@Override
	public String toString() {
		System.out.println("invoking main in toString");
		return "name :" +name +"manufacture :"+manufacture +"cartridge :" +cartridge+ "action :" +action + "noOfBullet :" +noOfBullets +"used :" +used;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			System.out.println("obj is equal to null..");
			if(obj instanceof Sniper)
			{
				System.out.println("obj is intance of Cook..");
				Sniper shoot=(Sniper)obj;
				if(shoot.name.equals(this.name)&&shoot.manufacture.equals(manufacture)&&shoot.cartridge.equals(this.cartridge)&&shoot.action.equals(this.action)&&shoot.noOfBullets==(this.noOfBullets)&&shoot.used.equals(this.used))
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
				System.out.println("obj is not of Sniper..");
			}
		}
		else
		{
			System.out.println("obj is not equal to Sniper...");
		}
	return false;
	}
}
