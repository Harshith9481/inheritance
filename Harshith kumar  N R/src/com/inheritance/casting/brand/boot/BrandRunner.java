package com.inheritance.casting.brand.boot;

import com.inheritance.casting.brand.app.Brand;
import com.inheritance.casting.brand.app.BrandUtil;
import com.inheritance.casting.brand.app.DuplicateBrand;
import com.inheritance.casting.brand.app.InternationalBrand;
import com.inheritance.casting.brand.app.LocalBrand;
import com.inheritance.casting.brand.app.NationalBrand;

public class BrandRunner {
	public static void main(String[] args) {
		
		Brand item=new Brand();
		LocalBrand item1=new LocalBrand();
		DuplicateBrand item2=new DuplicateBrand();
		NationalBrand item3=new NationalBrand();
		InternationalBrand item4=new InternationalBrand();
		
		BrandUtil.items(item1);
		System.out.println(".............................");
		BrandUtil.items(item2);
		System.out.println(".............................");
		BrandUtil.items(item3);
		System.out.println(".............................");
		BrandUtil.items(item4);
		System.out.println(".............................");
		
	}

}
