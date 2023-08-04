package com.inheritance.chaning.Rope.boot;

import com.inheritance.chaning.Rope.app.Rope;
import com.inheritance.chaning.Rope.app.WireRope;

public class RopeRunner {
	
	public static void main(String[] args) {
		
		Rope line=new Rope(200,1800,"natural Rope","cotten");
		System.out.println("length :"+line.length);
		System.out.println("cost :"+line.cost);
		System.out.println("type :"+line.type);
		System.out.println("material :"+line.material);
		
		WireRope line1=new WireRope();
		System.out.println("length :"+line1.length);
		System.out.println("cost :"+line1.cost);
		System.out.println("type :"+line1.type);
		System.out.println("material :"+line1.material);
		
		
	}

}
