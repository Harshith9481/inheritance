package com.kumar.xworkz.internal.Bakery;

public class KrishnaBakery extends Bakery{
	
			
			@Override
			public void Bakery()
			{
				System.out.println("no-args const of bakery");
			}
			@Override
			public void Bakery(String name)
			{
				System.out.println("invoking main in string name of bakery");
			}
			@Override
			public void Bakery(String name,String location)
			{
				System.out.println("invoking main in string name and location of bakery");
			}
			@Override
			public void Bakery(String name,String location,int noOfWorker)
			{
				System.out.println("invoking main in string and int no of worker");
			}
			@Override
			public void Bakery(String name,String location,int noOfWorker,double workerSalery)
			{
				System.out.println("invoking main in string and int no of worker paid salary");
			}
			@Override
			public void Bakery(String name,String location,int noOfWorker,double workerSalery,int noOfItem)
			{
				System.out.println("invoking main in string and int all items");
			}
			@Override
			public void Bakery(String name,String location,int noOfWorker,double workerSalery,int noOfItem,int priceOfItem)
			{
				System.out.println("invoking main in string and int price of all items");
			}
			

		


	}



