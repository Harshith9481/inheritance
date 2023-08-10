package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.Instagram.app.Instagram;

public class InstagramRunner {
	public static void main(String[] args) {
		
		
		Instagram insta=new Instagram();
		insta.setfounder("kevin Systrom");
		insta.setname("Instagram");
		insta.setdataused(41);
		insta.isInstal(true);
		insta.setfollowers("yes");
		insta.setphotos("send");
		insta.setvideos("play");
		insta.setvoicecall("can call");
		insta.setvideocall("yes");
		insta.setmessage("yes");
		insta.setlocation("contacts");
		insta.setcomments("can pay");
		insta.setscan("scan to another pc");
		insta.setmoney(12000);
		
		
		System.out.println(insta.getfounder());
		System.out.println(insta.getName());
		System.out.println(insta.getdataUsed());
		System.out.println(insta.isinstal());
		System.out.println(insta.getfollowers());
		System.out.println(insta.getvideos());
		System.out.println(insta.getvoicecall());
		System.out.println(insta.getvideocall());
		System.out.println(insta.getmessage());
		System.out.println(insta.getlocation());
		System.out.println(insta.getcomments());
		System.out.println(insta.getscan());
		System.out.println(insta.getmoney());
		
		
	}

}
