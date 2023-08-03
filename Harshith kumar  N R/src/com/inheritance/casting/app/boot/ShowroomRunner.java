package com.inheritance.casting.app.boot;

import com.inheritance.casting.app.MobileShowroom;
import com.inheritance.casting.app.Showroom;
import com.inheritance.casting.app.ShowroomUtil;
import com.inheritance.casting.app.WatchShowroom;

public class ShowroomRunner {
	
	public static void main(String[] args)
	{
		Showroom store=new Showroom();
		MobileShowroom room=new MobileShowroom();
		WatchShowroom room2=new WatchShowroom();
		
		ShowroomUtil.run(store);
		System.out.println("..................................");
		ShowroomUtil.run(room);
		System.out.println("..................................");
		ShowroomUtil.run(room2);
		System.out.println("..................................");
		
	}

}
