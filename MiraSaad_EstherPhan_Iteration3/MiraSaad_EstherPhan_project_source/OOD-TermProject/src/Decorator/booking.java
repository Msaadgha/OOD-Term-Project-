package Decorator;

import java.util.*;

import Transport.Helicopter;
import Transport.Limousine;
import Transport.PrivateJet;
import Transport.Yacht;
public class booking {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
//*******************************************Helicopter/ Flight.java **********************************//
	
	Helicopter h1 = new Helicopter("TakeFlight Helicopter", 5, 6, "Pilot Henry F.", 30.12);
	Helicopter h2 = new Helicopter("FlyHigh Heli", 93, 2, "Pilot Sarah H.", 18.15);
	Helicopter h3 = new Helicopter("Soar Away", 12, 3, "Pilot Drake R.", 19.20);
	Helicopter h4 = new Helicopter("BirdOfAFeather", 85, 4, "Pilot Donkey D.", 25.12);
	
	Flight fh1 = new Flight("Houston, Texas", "Cleveland, Ohio", "6-12-2023", h1);
	Flight fh2 = new Flight("Miami, Florida", "Seattle, Washington", "9-22-2023", h2);
	Flight fh3 = new Flight("Denver, Colorado", "Atlanta, Georgia", "10-18-2023", h3);
	Flight fh4 = new Flight("Nashville, Tennessee", "Brooklyn, New York", "12-25-2023", h4);
	

	ArrayList<Flight> flights = new ArrayList<Flight>();
	flights.add(fh1);
	flights.add(fh2);
	flights.add(fh3);
	flights.add(fh4);
	
	
	//*******************************************Private Jet/ pjFlight.java **********************************//	

	PrivateJet p1 = new PrivateJet("WhateverJet", 43, 7, "Pilot Sam R.", 80.54);
	PrivateJet p2 = new PrivateJet("PrivateGo", 91, 6, "Pilot Rain W.", 91.33);
	PrivateJet p3 = new PrivateJet("LetGo", 321, 8, "Pilot Brit C.", 101.98);
	PrivateJet p4 = new PrivateJet("SoarJet", 87, 1, "Pilot Nancy F.", 132.12);
	
	pjFlight fp1 = new pjFlight("Denver, Colorado", "Seattle, Washington", "5-30-2023", p1);
	pjFlight fp2 = new pjFlight("Toronto, Canada", "Honolulu, Hawaii", "7-4-2023", p3);
	pjFlight fp3 = new pjFlight("Orlando, Florida", "San Diego, California", "9-19-2023", p1);
	pjFlight fp4 = new pjFlight("Atlanta, Georgia", "Seattle, Washington", "6-30-2023", p2);

	
	ArrayList<pjFlight> pjflights = new ArrayList<pjFlight>();
	pjflights.add(fp1);
	pjflights.add(fp2);
	pjflights.add(fp3);
	pjflights.add(fp4);

	
	//*******************************************Yacht/yachtbooking.java**********************************//	
	
		Yacht y1 = new Yacht("Yacht Fancy",431, 12, "Captian Ship", 100.90);
		Yacht y2 = new Yacht("Yacht Rihanna",443, 10, "Captain Louis",  200.30);
		Yacht y3 = new Yacht("Yacht Summer", 312, 3, "Captain France", 400.11);
		
		yachtbooking yb1 = new yachtbooking("Port Everglades, FL","Palma de Mallorca, Spain", "March", "2024", y1);
		yachtbooking yb2 = new yachtbooking("Port Everglades, FL", "Genoa, Italy", "April", "2024", y2);
		yachtbooking yb3 = new yachtbooking("Port Everglades, FL", "Lavrion, Greece", "May", "2023", y3);
		yachtbooking yb4 = new yachtbooking("Tivat, Montenegro", "St. Thomas, USVI","October", "2023", y3);
		
		ArrayList<yachtbooking> ship = new ArrayList<yachtbooking>();
		ship.add(yb1);
		ship.add(yb2);
		ship.add(yb3);
		ship.add(yb3);

		
//*******************************************Limousine/limobooking.java**********************************//	

		Limousine l1 = new Limousine("Chrysler", "300", 14.13, 7, "Driver Steven R.");
		Limousine l2 = new Limousine("Hummer", "H2", 31.11, 6, "Driver Mark C.");
		Limousine l3 = new Limousine("Bentley", "Mulsanne", 11.11, 7, "Driver Martian T.");
		Limousine l4 = new Limousine("Cadillac", "XTS" ,40.11, 5, "Driver French M.");
		
	
		
	}

}