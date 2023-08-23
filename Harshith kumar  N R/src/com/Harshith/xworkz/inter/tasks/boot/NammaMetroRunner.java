package com.Harshith.xworkz.inter.tasks.boot;

import com.Harshith.xworkz.inter.task.inter.NammaMetro;
import com.Harshith.xworkz.inter.tasks.app.Metro;

public class NammaMetroRunner {
	
	public static void main(String[] args) {
		
		Metro metro=new NammaMetro();
		metro.dontAllowTheLiquorBottel("drinks");
		metro.dontAllowSharpMetals("kniff", "sharp material");
		metro.allowsOnlyCardOrTokan(32, "namma metro", 14);
		
	}

}
