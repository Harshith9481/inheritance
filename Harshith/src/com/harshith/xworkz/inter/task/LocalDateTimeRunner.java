package com.harshith.xworkz.inter.task;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeRunner {
	
	public static void main(String[] args) {
		
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDateTime.of(15, 12, 4, 17, 45));
		
		System.out.println(LocalDateTime.of(2001, 2, 11, 6, 30, 45));
		
		System.out.println(LocalDateTime.class);
		
		System.out.println(LocalDateTime.MIN);
		
	}

}
