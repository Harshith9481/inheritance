package com.kumar.xworkz.internal.Bakery;



	public class Bakery {
		
		public String name;
		public String location;
		public int noOfWorker;
		public double workerSalery;
		public int noOfItems;
		public int priceOfItem;
		
		
		
		public void Bakery()
		{
			System.out.println("no-args const of bakery");
		}
		public void Bakery(String name)
		{
			System.out.println("invoking main in string name of bakery");
		}
		public void Bakery(String name,String location)
		{
			System.out.println("invoking main in string name and location of bakery");
		}
		public void Bakery(String name,String location,int noOfWorker)
		{
			System.out.println("invoking main in string and int no of worker");
		}
		public void Bakery(String name,String location,int noOfWorker,double workerSalery)
		{
			System.out.println("invoking main in string and int no of worker paid salary");
		}
		public void Bakery(String name,String location,int noOfWorker,double workerSalery,int noOfItem)
		{
			System.out.println("invoking main in string and int all items");
		}
		public void Bakery(String name,String location,int noOfWorker,double workerSalery,int noOfItem,int priceOfItem)
		{
			System.out.println("invoking main in string and int price of all items");
		}
		

	}



