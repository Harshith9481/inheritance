package com.inheritance.chaning.Ground.boot;

import com.inheritance.chaning.Ground.app.ChinnaswamiGround;
import com.inheritance.chaning.Ground.app.Ground;

public class GroundRunner {
	public static void main(String[] args) {
		
	
	
	Ground play=new Ground("neharu ground","bangalur",400,800);
	System.out.println("Ground name :"+play.name);
	System.out.println("location :"+play.location);
	System.out.println("settingCapacity:"+play.settingCapacity);
	System.out.println("length :"+play.length);
	
	ChinnaswamiGround play1=new ChinnaswamiGround();
	System.out.println("Ground name :"+play1.name);
	System.out.println("location :"+play1.location);
	System.out.println("settingCapacity:"+play1.settingCapacity);
	System.out.println("length :"+play1.length);
	
	
	
	
	}
}
