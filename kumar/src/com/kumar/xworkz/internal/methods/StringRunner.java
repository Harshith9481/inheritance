package com.kumar.xworkz.internal.methods;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class StringRunner {
	public static void main(String[] args) {
		
	
	
	String string="elephant";
	int ref=string.codePointAt(4);
	System.out.println(ref);
	
	int ref1=string.codePointCount(2,8);
	System.out.println(ref1);
	
	
	int ref2=string.hashCode();
	System.out.println(ref2);
	
	int ref3=string.compareToIgnoreCase("elephant");
	System.out.println(ref3);
	
	String ref4=string.concat("elephant runnes fast");
	System.out.println(ref4);
	
	
	
	boolean ref6=string.contains("lion");
	System.out.println(ref6);
	
	String[] ref7=string.split("lion cage");
	System.out.println(ref7);
	
	String[] ref8=string.split("lion cage", 9);
	System.out.println(ref8);
	
	String ref9=string.trim();
	System.out.println(ref9);
	
	int ref0=string.indexOf(8);
	System.out.println(ref0);
	
	int ref11=string.indexOf(5);
	System.out.println(ref11);
	
	int ref12=string.indexOf("fox", 4);
	System.out.println(ref12);
	
	int ref13=string.indexOf(4, 12);
	System.out.println(ref12);
	
	boolean ref14=string.isEmpty();
	System.out.println(ref14);
	
	int ref15=string.length();
	System.out.println(ref15);
	
	boolean ref16=string.startsWith("E");
	System.out.println(ref16);
	
	boolean ref17=string.endsWith("gf");
	System.out.println(ref17);
	
	boolean ref18=string.equalsIgnoreCase("lg");
	System.out.println(ref18);
	
	boolean ref19=string.equals("elephant");
	System.out.println(ref19);
	
	String ref20=string.toLowerCase();
	System.out.println(ref20);
	
	String ref21=string.toUpperCase();
	System.out.println(ref21);
	
	String ref22=string.substring(4);
	System.out.println(ref22);
	
	String ref23=string.substring(1, 8);
	System.out.println(ref23);
	
	int ref24=string.compareTo("monky");
	System.out.println(ref24);
	
	
	System.out.println("----------------------DATE-------------------");
	Date date=new Date();
	boolean ref25=date.after(date);
	System.out.println(ref25);
	boolean ref26=date.before(Date.from(Instant.now()));
	System.out.println(ref26);
	Object ref27=date.clone();
	System.out.println(ref27);
	int ref28=date.compareTo(Date.from(Instant.now()));
	System.out.println(ref28);
	Class ref29=date.getClass();
	System.out.println(ref29);
	
	System.out.println("-------------------LOCAL DATE----------------");
	
	System.out.println(LocalDate.now());
	System.out.println(LocalDate.now(Clock.systemUTC()));
	System.out.println(LocalDate.class);
	System.out.println(LocalDate.ofYearDay(1998, 07));
	System.out.println(LocalDate.now());
	System.out.println(LocalDate.of(1998, 10, 11));
	
	
	System.out.println("...................LocalDateTime...................");
	
	System.out.println(LocalDateTime.class);
	System.out.println(LocalDateTime.of(1998, 10, 11, 845, 60));
	System.out.println(LocalDateTime.now());
	System.out.println(LocalDateTime.of(1998, 12, 11, 10, 45, 60, 24));
	System.out.println(LocalDateTime.now());
	
	
	
	System.out.println("===========thread===========");
	
	
	System.out.println(Thread.holdsLock(Object.class));
	System.out.println(Thread.activeCount());
	System.out.println(Thread.interrupted());
	System.out.println(Thread.currentThread());
	System.out.println(Thread.getDefaultUncaughtExceptionHandler());
	
	
	System.out.println("-----------------System---------------");
	
	System.out.println(System.getenv("vinay"));
	System.out.println(System.currentTimeMillis());
	System.out.println(System.getProperty("kumar"));
	System.out.println(System.lineSeparator());
	System.out.println(System.getProperties());
	
	}
}
