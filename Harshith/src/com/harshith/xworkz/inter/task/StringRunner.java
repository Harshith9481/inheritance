package com.harshith.xworkz.inter.task;

public class StringRunner {

	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer();
		
		StringBuffer ref1=buffer.append(false);
		System.out.println("String append :" +ref1);
		
		StringBuffer ref2=buffer.append('L');
		System.out.println("String char append :"+ref2);
		
		StringBuffer ref3=buffer.append(true);
		System.out.println("String boolean append :"+ref3);
		int ref4=buffer.hashCode();
		System.out.println("Stringbuffer harscode:"+ref4);
		
		StringBuffer ref5=buffer.append(12);
		System.out.println("Stringbuffer int append :"+ref5);
	}
	
}
