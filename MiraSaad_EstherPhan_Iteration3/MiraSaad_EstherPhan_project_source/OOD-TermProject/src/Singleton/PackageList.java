package Singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Transport.Helicopter;
import Transport.Limousine;
import Transport.PrivateJet;
import Transport.Yacht;
import Trip.Place;

public class PackageList {
	
	private static final PackageList uniqueInstance = new PackageList();
	private static final String packagesFile = "term_project/src/main/java/com/termproject/Singleton/packages.txt";
	ArrayList<Package> packageList = new ArrayList<>();
	private static DateTimeFormatter formatter;
	
	private PackageList() {
        formatter = DateTimeFormatter.ofPattern("HH:mm");
        loadPackagesFile();
    }
	
	@SuppressWarnings("unused")
	private void loadPackagesFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(packagesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String transportName = data[0];
                float price = Float.parseFloat(data[1]);
                int hoursOfTravelTime = Integer.parseInt(data[2]);
                Place travelsFrom = new Place(data[3]);
                Place travelsTo = new Place(data[4]);
                LocalTime departTime = LocalTime.parse(data[5], formatter);
                LocalTime arrivalTime = LocalTime.parse(data[6], formatter);

                Object transport = null;
                switch (transportName) {
                    case "Helicopter":
                        transport = new Helicopter(transportName, hoursOfTravelTime, hoursOfTravelTime, transportName, price);
                        break;
                    case "Limousine":
                        transport = new Limousine(transportName, transportName, price, hoursOfTravelTime, transportName);
                        break;
                    case "PrivateJet":
                        transport = new PrivateJet(transportName, hoursOfTravelTime, hoursOfTravelTime, transportName, price);
                        break;
                    case "Yacht":
                        transport = new Yacht(transportName, hoursOfTravelTime, hoursOfTravelTime, transportName, price);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	 public static PackageList getInstance() {
	        return uniqueInstance;
	    }
	 
	 public ArrayList<Package> getPackageList() {
	        return packageList;
	    }

}
