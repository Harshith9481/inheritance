package com.inheritance.casting.brand.app;

public class BrandUtil {
	
	
	public static void location(Brand brand)
	{
		System.out.println("brand.brandName");
		brand.brandInfo();
		
		if(brand instanceof LocalBrand)
			
		{
			LocalBrand item1=(LocalBrand)brand;
			System.out.println(item1.price);
			item1.local();
		}
		if(brand instanceof DuplicateBrand)
		{
			DuplicateBrand item2=(DuplicateBrand)brand;
			System.out.println(item2.location);
			item2.Duplicate();
		}
		if(brand instanceof NationalBrand)
		{
			NationalBrand item3=(NationalBrand)brand;
			System.out.println(item3.type);
			item3.National();
		}
		if(brand instanceof InternationalBrand)
		{
			InternationalBrand item4=(InternationalBrand)brand;
			System.out.println(item4.cost);
			item4.international();
					
		}
		
			
	}

	public static void items(InternationalBrand item4) 
	{
		
	}
}
