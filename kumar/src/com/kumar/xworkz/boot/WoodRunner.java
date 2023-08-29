package com.Xworkz.kumar.boot;

import com.Xworkz.kumar.app.Bus;
import com.Xworkz.kumar.app.Charger;
import com.Xworkz.kumar.app.Laptop;
import com.Xworkz.kumar.app.Laptopp;
import com.Xworkz.kumar.app.Mobile;
import com.Xworkz.kumar.app.Pant;
import com.Xworkz.kumar.app.Paper;
import com.Xworkz.kumar.app.Passenger;
import com.Xworkz.kumar.app.Shirt;
import com.Xworkz.kumar.app.Trainer;
import com.Xworkz.kumar.app.Wood;
import com.Xworkz.kumar.app.Zip;

public class WoodRunner {
	
	public static void main(String[] args) {
		
		Wood wood=new Wood("Bete", 14, "Vijaya", 6);
		Paper paper=new Paper();
		
		wood.setNewsPaper(paper);
		System.out.println("invoking main in wood makes paper");
		
		System.out.println("...............................");
		
		Shirt tshirt=new Shirt("puma", "color",'L');
		Botton ton=new Botten();
		
		Shirt.setShape(Botton);
		System.out.println("invoking main in shirt botton");
		System.out.println("......................................");
		
		Bus bus=new Bus("asoka layland", "KA18Z9456", 18, "KKB");
		
		Passenger passenger=new Passenger();
		
		Bus.setSeats(Passenger);
		System.out.println("invoking main in bus has a seats");
		System.out.println("......................................");
		
		
		Pant pant=Pant();
		
		Zip zip=new Zip();
		
		Pant.setshorts(Pant);
		
		System.out.println("invoking main in pant has a zip");
		System.out.println("......................................");
		
		Wood wood=new Wood("bete", 14, vijayakarnataka, 6);
		Paper paper=new Paper();
		
		Wood.setNewsPaper(Wood);
		
		System.out.println("invoking main in wood has a paper");
		System.out.println("......................................");
		
		Mobile mob=new Mobile("vivo", "vivoy33", 21000, "poorvika");
		
		Charger ger=new Charger();
		
		Mobile.setCharger(vivo);
		
		System.out.println("invoking main in mobile has a charger");
		System.out.println("......................................");
		
		
		Laptopp lap=new Laptopp();
		Processor pro=new Processor();
		
		Laptop.setLaptop(Processor);
		System.out.println("invoking main in laptop has a processor");
		System.out.println("......................................");
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
