package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.whatsapp.PhonePay;

public class PhonePayRunner {
	
	public static void main(String[] args) {
		
		PhonePay pay=new PhonePay();
		
		pay.setfounder("sameer Nigam");
		pay.setlunch("dec 2015");
		pay.setfingerprint(true);
		pay.setscan("scan");
		pay.setamount(150);
		pay.setupi(158741);
		pay.setsuccessful(true);
		pay.setfailed(false);
		pay.setmsg("succesfully completed");
		pay.settime(15);
		pay.setdataUsed(4);
		pay.sethistory("history");
		pay.settransfor("amount");
		pay.setupiId("142575@icici");
		
		
		System.out.println(pay.getfounder());
		System.out.println(pay.getlunch());
		System.out.println(pay.isfingerprint());
		System.out.println(pay.getscan());
		System.out.println(pay.getamount());
		System.out.println(pay.getUPi());
		System.out.println(pay.issuccessful());
		System.out.println(pay.isfailed());
		System.out.println(pay.getmsg());
		System.out.println(pay.gettime());
		System.out.println(pay.getdataUsed());
		System.out.println(pay.gethistory());
		System.out.println(pay.gettransfor());
		System.out.println(pay.getupiId());
		
		
		
	}

}
