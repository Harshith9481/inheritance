package com.inheritance.casting.browser.ap;


public class BrowserUtil {

	public static void searchBar(Browser design)
	{
		System.out.println(design.Storage);
		design.design();
	
		if(design instanceof ChromeBrowser)
		{
			ChromeBrowser browse=(ChromeBrowser)design;
			System.out.println(browse.design);
			browse.size();
		}
		
		if(design instanceof OperaBrowser)
		{
			OperaBrowser browse1=(OperaBrowser)design;
			System.out.println(browse1.color);
			browse1.search();
		}
		
		if(design instanceof FireFox)
		{
			FireFox browse2=(FireFox)design;
			System.out.println(browse2.size);
			browse2.color();
		}
		
		if(design instanceof Edge)
		{
			Edge browse3=(Edge)design;
			System.out.println(browse3.name);
			browse3.nameOfUser();
		}
		
	}
}