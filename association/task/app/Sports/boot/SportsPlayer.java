package com.association.task.app.Sports.boot;

import com.association.task.app.Sports.Area;
import com.association.task.app.Sports.Building;
import com.association.task.app.Sports.Floor;
import com.association.task.app.Sports.Hometown;
import com.association.task.app.Sports.Lift;
import com.association.task.app.Sports.Player;
import com.association.task.app.Sports.Sports;
import com.association.task.app.Sports.corporator;

public class SportsPlayer {
	public static void main(String[] args) {

		System.out.println("running main in SportsPlayer");

		String name = "Cricket";

		Floor floor = new Floor("ground floor", 7, 1);
		Floor floor1 = new Floor("1st floor", 7, 2);
		Floor floor2 = new Floor("2st floor", 8, 3);
		Floor floor3 = new Floor("3rd floor", 7, 1);
		Floor floor4 = new Floor("4th floor", 7, 2);
		Floor floor5 = new Floor("5th floor", 8, 3);
		Floor floor6 = new Floor("6th floor", 8, 3);

		Floor floor7[] = { floor, floor1, floor2 };
		Floor floor8[] = { floor3, floor4, floor5, floor6 };

		Lift lift = new Lift(2);
		Lift lift1 = new Lift(3);
		Lift lift2 = new Lift(1);
		Lift lift3 = new Lift(2);
		Lift lift4 = new Lift(3);
		Lift lift5 = new Lift(1);
		Lift lift6 = new Lift(1);

		Lift lift7[] = { lift, lift1, lift2 };
		Lift lift8[] = { lift3, lift4, lift5, lift6 };

		Building building = new Building(floor7, lift7);
		Building building1 = new Building(floor8, lift8);

		Building building2[] = { building, building1 };

		System.out.println("****************************");
		corporator corporator = new corporator("harshith", building2);

		Area area = new Area("Rajajinagara", corporator);
		Area area1 = new Area("basaveshwaranagara", corporator);
		Area area2 = new Area("nadinilayvot", corporator);
		Area area3 = new Area("", corporator);
		Area area4 = new Area("Rajajinagara", corporator);
		Area area5 = new Area("basaveshwaranagara", corporator);
		Area area9[] = { area };
		Area area10[] = { area1 };
		Area area11[] = { area2 };
		Area area12[] = { area3 };
		Area area13[] = { area4 };

		Hometown hometown = new Hometown("Banglore", 570006, area10);
		Hometown hometown1 = new Hometown("Chamarajanagar", 577303, area11);
		Hometown hometown2 = new Hometown("Mysore", 579876, area12);
		Hometown hometown3 = new Hometown("Davangere", 577123, area13);
		Hometown hometown4 = new Hometown("NR pura", 577134, area9);

		Player player = new Player("harshi", "10Year", building, hometown);
		Player player1 = new Player("Manu", "10Year", building, hometown1);
		Player player2 = new Player("hareesh", "5year", building, hometown2);
		Player player4 = new Player("anket", "4years", building, hometown3);
		Player player5 = new Player("chandu", "6year", building, hometown4);

		Player player6[] = { player };
		Player player7[] = { player5 };
		Player player8[] = { player4 };
		Player player9[] = { player2 };
		Player player10[] = { player1 };

		Sports sports = new Sports("Cricket", player6);
		Sports sports1 = new Sports("Cricket", player7);
		Sports sports2 = new Sports("Cricket", player8);
		Sports sports3 = new Sports("Cricket", player9);
		Sports sports4 = new Sports("Cricket", player10);

		sports.printInfo();
		sports1.printInfo();
		sports2.printInfo();
		sports3.printInfo();
		sports4.printInfo();

	}

}
