package com.kumar.xworkz.internal.accessspecifier.whatsapp.boot;

import com.kumar.xworkz.internal.accessspecifier.whatsapp.Pubg;

public class PubgRunner {
	public static void main(String[] args) {
		
	
	
	Pubg game=new Pubg();
	game.setDeveloper("PUBG Studios");
	game.setPublisher("Krafton microsoft studios");
	game.setDirector("Bredan greene");
	game.setProducer("kim-chang-han");
	game.setDesigner("Bredan greene");
	game.setArtist("Jang-Tae-seok");
	game.setCompser("Tom salta");
	game.setSeries("PUBG Universe");
	game.setEngine("Unreal Engine 4");
	game.setReleaseYear(2017);
	game.setGenre("Battle Royale");
	game.setMode("Multiplayer");
	game.setReleaseYearIos(2018);
	game.setReleaseYearAndriod(2018);
	System.out.println("Developer :"+game.getDeveloper());
	System.out.println("Publisher :"+game.getPublisher());
	System.out.println("Director :"+game.getDirector());
	System.out.println("Producer :"+game.getProducer());
	System.out.println("Designer :"+game.getDesigner());
	System.out.println("Artist :"+game.getArtist());
	System.out.println("Composer :"+game.getCompser());
	System.out.println("Series :"+game.getSeries());
	System.out.println("Engine :"+game.getEngine());
	System.out.println("Release Year :"+game.getReleaseYear());
	System.out.println("Genre :"+game.getGenre());
	System.out.println("Mode :"+game.getMode());
	System.out.println("Release Year for Ios :"+game.getReleaseYearIos());
	System.out.println("Release Year for Andriod :"+game.getReleaseYearAndriod();
	
	}
}
