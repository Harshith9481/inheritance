package com.harshith.xworkz.inter.task;

public class StringBuilderRunner {
	
	public static void main(String[] args) {
		
		StringBuilder builder=new StringBuilder();
		
		StringBuilder ref1=builder.append(true);
		System.out.println(ref1);
		
		StringBuilder ref2=builder.append(builder);
		System.out.println(ref2);
		
		StringBuilder ref3=builder.append("vinay");
		System.out.println(ref3);
		
		StringBuilder ref4=builder.insert(41, builder);
		System.out.println(ref4);
		
		StringBuilder ref5=builder.insert(11, 1452);
		System.out.println(ref5);
		
	}

}
