package com.kumar.xworkz.internal.boot;

import com.kumar.xworkz.internal.Bakery.*;
import com.kumar.xworkz.internal.City.City;
import com.kumar.xworkz.internal.City.DavangereCity;
import com.kumar.xworkz.internal.Hostel.Hostel;
import com.kumar.xworkz.internal.Hostel.jainHostel;
import com.kumar.xworkz.internal.Hotel.JainHotel;
import com.kumar.xworkz.internal.Mall.Mall;
import com.kumar.xworkz.internal.Mall.OrionMall;
import com.kumar.xworkz.internal.Market.ChikpeteMarket;
import com.kumar.xworkz.internal.Market.Market;
import com.kumar.xworkz.internal.PoliceStation.NrpuraStation;
import com.kumar.xworkz.internal.PoliceStation.PoliceStation;
import com.kumar.xworkz.internal.Pub.Pub;
import com.kumar.xworkz.internal.Pub.ToitPub;
import com.kumar.xworkz.internal.Street.RajkumarRoad;
import com.kumar.xworkz.internal.Street.Street;
import com.kumar.xworkz.internal.Temple.DeviTemple;
import com.kumar.xworkz.internal.Temple.Temple;
import com.kumar.xworkz.internal.Theater.GithangaliTheater;
import com.kumar.xworkz.internal.Theater.Theater;
import com.kumar.xworkz.internal.Zoo.OldZoo;
import com.kumar.xworkz.internal.Zoo.Zoo;
import com.kumar.xworkz.internal.hospital.Hospital;
import com.kumar.xworkz.internal.hospital.SugunaHospital;
import com.kumar.xworkz.internal.Hotel.*;
public class AllInOneRunner {

	public static void main(String[] args) {

		Bakery bakery=new KrishnaBakery();
		
		bakery.Bakery("Lakshmi Bakery");
		bakery.Bakery("Lakshmi Bakery","N R Pura");
		bakery.Bakery("Lakshmi Bakery","N R Pura",10);
		bakery.Bakery("Lakshmi Bakery","N R Pura",10,8000);
		bakery.Bakery("Lakshmi Bakery","N R Pura",10,8000,12);
		bakery.Bakery("Lakshmi Bakery","N R Pura",10,8000,12,300);
		
		System.out.println("\n");
		
		City park=new DavangereCity();
		park.chikamangalur("Chikkamangaluru");
		park.chikamangalur("Chikkamangaluru","india");
		park.chikamangalur("Chikkamangaluru","india","Karnataka");
		park.chikamangalur("Chikkamangaluru","india","Karnataka",18);
		park.chikamangalur("Chikkamangaluru","india","Karnataka",18,9);
		park.chikamangalur("Chikkamangaluru","india","Karnataka",18,9,1700000);
		
		System.out.println("\n");
		
		Hospital care=new SugunaHospital();
		care.wards("Pushpa Hospital");
		care.wards("Pushpa Hospital","N R Pura");
		care.wards("Pushpa Hospital","N R Pura",10);
		care.wards("Pushpa Hospital","N R Pura",10,30);
		care.wards("Pushpa Hospital","N R Pura",10,30,3);
		care.wards("Pushpa Hospital","N R Pura",10,30,3,"Saroja");
		
		System.out.println("\n");
		
		Hostel cage=new jainHostel();
		cage.collagehostel("Jain Hostel");
		cage.collagehostel("Jain Hostel","Shamnur");
		cage.collagehostel("Jain Hostel","Shamnur","Davangere");
		cage.collagehostel("Jain Hostel","Shamnur","Davangere","Reddy");
		cage.collagehostel("Jain Hostel","Shamnur","Davangere","Reddy",18);
		cage.collagehostel("Jain Hostel","Shamnur","Davangere","Reddy",18,2);
		
		System.out.println("\n");
		
		Hotel cost=new JainHotel();
		cost.menakshiBhavan("Meenakshibhavan");
		cost.menakshiBhavan("Meenakshibhavan","Davanagere");
		cost.menakshiBhavan("Meenakshibhavan","Davanagere",20);
		cost.menakshiBhavan("Meenakshibhavan","Davanagere",20,300);
		cost.menakshiBhavan("Meenakshibhavan","Davanagere",20,300,400);
		cost.menakshiBhavan("Meenakshibhavan","Davanagere",20,300,400,200);
		
		System.out.println("\n");
		
		Mall run=new OrionMall();
		run.lulumall("lulu mall");
		run.lulumall("lulu mall","Banglore");
		run.lulumall("lulu mall","Banglore","Flyover");
		run.lulumall("lulu mall","Banglore","Flyover",30);
		run.lulumall("lulu mall","Banglore","Flyover",30,8000);
		
		System.out.println("\n");
		
		Market sante=new ChikpeteMarket();
		sante.krmarket("K R Market");
		sante.krmarket("K R Market","Banglore");
		sante.krmarket("K R Market","Banglore","Near Metro");
		sante.krmarket("K R Market","Banglore","Near Metro",10);
		sante.krmarket("K R Market","Banglore","Near Metro",10,3000);
		
		System.out.println("\n");
		
		PoliceStation cell=new NrpuraStation();
		cell.koppaPoliceStation("Koppa Police Station");
		cell.koppaPoliceStation("Koppa Police Station","Opp Petrol Bunk");
		cell.koppaPoliceStation("Koppa Police Station","Opp Petrol Bunk","CKM");
		cell.koppaPoliceStation("Koppa Police Station","Opp Petrol Bunk","CKM","Koppa taluk");
		cell.koppaPoliceStation("Koppa Police Station","Opp Petrol Bunk","CKM","Koppa Taluk",3);
		cell.koppaPoliceStation("Koppa Police Station","Opp Petrol Bunk","CKM","Koppa Taluk",3,30);
		
		System.out.println("\n");
		
		Pub party=new ToitPub();
		party.citybar("Sky Bar");
		party.citybar("Sky Bar","Rajajinagar");
		party.citybar("Sky Bar","Rajajinagar",10);
		party.citybar("Sky Bar","Rajajinagar",10,9000);
		party.citybar("Sky Bar","Rajajinagar",10,9000,10303);
		party.citybar("Sky Bar","Rajajinagar",10,9000,10303,1560);
		
		System.out.println("\n");
		
		Street road=new RajkumarRoad();
		road.puneetRajkumarRoad("puneetRajkumarRoad");
		road.puneetRajkumarRoad("puneetRajkumarRoad","nandini layout");
		road.puneetRajkumarRoad("puneetRajkumarRoad","nandini layout","bengaluru");
		road.puneetRajkumarRoad("puneetRajkumarRoad","nandini layout","bengaluru","NH410");
		road.puneetRajkumarRoad("puneetRajkumarRoad","nandini layout","bengaluru","NH410",540);
		road.puneetRajkumarRoad("puneetRajkumarRoad","nandini layout","bengaluru","NH410",540,280);
		
		System.out.println("\n");
		
		Temple god=new DeviTemple();
		god.ramTemple("Anjeneya");
		god.ramTemple("Anjeneya","Ram Mandir");
		god.ramTemple("Anjeneya","Ram Mandir","Banglore");
		god.ramTemple("Anjeneya","Ram Mandir","Banglore","Taluk");
		god.ramTemple("Anjeneya","Ram Mandir","Banglore","Taluk",3500);
		god.ramTemple("Anjeneya","Ram Mandir","Banglore","Taluk",3500,30);
		
		System.out.println("\n");
		
		Theater movie=new GithangaliTheater();
		movie.jmjTheater("JMJ");
		movie.jmjTheater("JMJ","Koppa","");
		movie.jmjTheater("JMJ","Koppa","CKM");
		movie.jmjTheater("JMJ","Koppa","CKM","Harshith");
		movie.jmjTheater("JMJ","Koppa","CKM","Harshith",1000);
		movie.jmjTheater("JMJ","Koppa","CKM","Harshith",1000,30);
		
		System.out.println("\n");
		
		Zoo animal=new OldZoo();
		animal.cage("Tiger Safari");
		animal.cage("Tiger Safari","Chamarajanagara");
		animal.cage("Tiger Safari","Chamarajanagara",300);
		animal.cage("Tiger Safari","Chamarajanagara",300,2000);
		animal.cage("Tiger Safari","Chamarajanagara",300,2000,20000);
		
		
	}
	
	

}
