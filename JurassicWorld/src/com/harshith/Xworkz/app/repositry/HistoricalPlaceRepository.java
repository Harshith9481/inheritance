package com.harshith.Xworkz.app.repositry;

public class HistoricalPlaceRepository implements HistoricalPlaces{
	
	
	String[] visit=new String [TOTAL_PLACE];
	int positions;
	
	@Override
	public void location(String places) {
		System.out.println("in historical places visiting in places");
		this.visit[positions]= places;
		
		System.out.println("places visit "+ visit +" such a good places"+ this.positions);
		this.positions++;
		
	}
	
	

}
