package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;


import com.kumar.xworkz.internal.accessspecifier.whatsapp.WhatsApp;

public class WhatsAppRunner {
	
	
	public static void main(String[] args) {
		
	
	WhatsApp whatsapp=new WhatsApp();
	whatsapp.setfounder("jan koum");
	whatsapp.setname("Whatsapp");
	whatsapp.setdataused(41);
	whatsapp.isInstal(true);
	whatsapp.setcontacts("yes");
	whatsapp.setphotos("send");
	whatsapp.setvideos("play");
	whatsapp.setvoicecall("can call");
	whatsapp.setvideocall("yes");
	whatsapp.setmessage("yes");
	whatsapp.setShareContects("contacts");
	whatsapp.setpay("can pay");
	whatsapp.setscan("scan to another pc");
	whatsapp.setstorage(12);
	
	
	System.out.println(whatsapp.getfounder());
	System.out.println(whatsapp.getName());
	System.out.println(whatsapp.getdataUsed());
	System.out.println(whatsapp.isinstal());
	System.out.println(whatsapp.getcontacts());
	System.out.println(whatsapp.getvideos());
	System.out.println(whatsapp.getvoicecall());
	System.out.println(whatsapp.getvideocall());
	System.out.println(whatsapp.getmessage());
	System.out.println(whatsapp.getShareContects());
	System.out.println(whatsapp.getpay());
	System.out.println(whatsapp.getscan());
	System.out.println(whatsapp.getstorage());
	
	
	
	}
}
