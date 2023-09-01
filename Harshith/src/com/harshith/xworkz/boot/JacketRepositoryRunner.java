package com.harshith.Xworkz.boot;

import com.harshith.Xworkz.app.repositry.Jacket;
import com.harshith.Xworkz.app.repositry.JacketRepositoryImpl;

public class JacketRepositoryRunner {
	
	public static void main(String[] args) {
		
		Jacket cover=new JacketRepositoryImpl();
		
		cover.costume("gants jacket");
		cover.costume("women jacket");
		cover.costume("kids jacket");
		cover.costume("rain jacket");
		cover.costume("stylish jacket");
		cover.costume("males jacket");
		cover.costume("females jacket");
		cover.costume("blasers");
		cover.costume("plastic jacket");
		cover.costume(" jacket");
		
		
	}

}
