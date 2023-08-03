package com.inheritance.casting.browser.app.boot;

import com.inheritance.casting.browser.ap.*;

public class BrowserRunner {
	
	public static void main(String[] args) {
		
		
		Browser browser=new Browser();
		ChromeBrowser crome=new ChromeBrowser();
		FireFox fire=new FireFox();
		Edge edge=new Edge();
		
		BrowserUtil.searchBar(browser);
		System.out.println("....................................");
		BrowserUtil.searchBar(crome);
		System.out.println("....................................");
		BrowserUtil.searchBar(fire);
		System.out.println("....................................");
		BrowserUtil.searchBar(edge);
		System.out.println("....................................");
		
	}

}
