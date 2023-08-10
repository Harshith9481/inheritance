package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.whatsapp.NammaYatri;

public class NammaYatriRunner {
	
	public static void main(String[] args) {
		
		  NammaYatri nammaYatri = new NammaYatri();

			nammaYatri.setTravelerName("Harshith");
			nammaYatri.setDriverName("Jeevan");
			nammaYatri.setSourceLocation("Rajajinagra");
			nammaYatri.setDestinationLocation("Banashankari");
			nammaYatri.setTravelDate("2023-08-15");
			nammaYatri.setDepartureTime("08:00 AM");
			nammaYatri.setArrivalTime("09:00 AM");
			nammaYatri.setVehicleModel("SUV");
			nammaYatri.setLicensePlate("AB14CD2361");
			nammaYatri.setTravelDistance(20.0);
			nammaYatri.setTravelFare(85.0);
			nammaYatri.setLuxuryVehicle(false);
			nammaYatri.setSharedRide(true);
			nammaYatri.setTravelerRated(true);

			System.out.println("Traveler Name: " + nammaYatri.getTravelerName());
			System.out.println("Driver Name: " + nammaYatri.getDriverName());
			System.out.println("Source Location: " + nammaYatri.getSourceLocation());
			System.out.println("Destination Location: " + nammaYatri.getDestinationLocation());
			System.out.println("Travel Date: " + nammaYatri.getTravelDate());
			System.out.println("Departure Time: " + nammaYatri.getDepartureTime());
			System.out.println("Arrival Time: " + nammaYatri.getArrivalTime());
			System.out.println("Vehicle Model: " + nammaYatri.getVehicleModel());
			System.out.println("License Plate: " + nammaYatri.getLicensePlate());
			System.out.println("Travel Distance: " + nammaYatri.getTravelDistance());
			System.out.println("Travel Fare: " + nammaYatri.getTravelFare());
			System.out.println("Is Shared Ride: " + nammaYatri.isSharedRide());
			System.out.println("Is Traveler Rated: " + nammaYatri.isTravelerRated());

		
	}

}
