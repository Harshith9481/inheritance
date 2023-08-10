package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.whatsapp.Youtube;

public class YoutubeRunner {
	
	public static void main(String[] args) {
		
		
		Youtube tube=new Youtube();
		
		tube.setfounder("jawed karim");
		tube.setname("youtube");
		tube.setdataused(400);
		tube.isInstal(true);
		tube.setsubscib("subscribed");
		tube.setphotos("photos");
		tube.setvideos("videos");
		tube.setchannelName("harshithnr");
		tube.setviewers("vinay");
		tube.setmessage("its an worst video of this year");
		tube.setshare("share");
		tube.setamount(12578);
		tube.sethistory("history");
		tube.setdownload("downloading");
		
		
		System.out.println(tube.getfounder());
		System.out.println(tube.getName());
		System.out.println(tube.getdataUsed());
		System.out.println(tube.isinstal());
		System.out.println(tube.getsubscrib());
		System.out.println(tube.getvideos());
		System.out.println(tube.getphotos());
		System.out.println(tube.gethistory());
		System.out.println(tube.getmessage());
		System.out.println(tube.getchannelName());
		System.out.println(tube.getviewer());
		System.out.println(tube.getdownload());
		System.out.println(tube.getshare());
		
		
	}

}
