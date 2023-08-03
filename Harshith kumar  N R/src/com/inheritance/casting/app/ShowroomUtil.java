package com.inheritance.casting.app;

public class ShowroomUtil{
	
	
	public static void run(Showroom store)
	{
		System.out.println(store.nameOfShowroom);
		store.condition();
		
		if(store instanceof MobileShowroom)
		{
			MobileShowroom room=(MobileShowroom)store;
		System.out.println(room.noOfPiece);
		room.bill();
		}
		if(store instanceof WatchShowroom)
		{
			WatchShowroom room1=(WatchShowroom)store;
			System.out.println(room1.collections);
			room1.store();
		}
		
		
	}

}
