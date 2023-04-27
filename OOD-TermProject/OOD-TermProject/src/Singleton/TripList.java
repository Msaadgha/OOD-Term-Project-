package Singleton;


import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Transport.Helicopter;
import Transport.Limousine;
import Transport.PrivateJet;
import Transport.Yacht;
import Trip.Place;

/**
 @param <TransportType>
 * @file PackageList.java
 Represents a list of available travel packages
 */
public class TripList<TransportType> {
    /**
     * Unique instance of the PackageList class.
     */
    private static final TripList uniqueInstance = new TripList();
    /**
    * Path to the packages file.
    */
    private static final String packagesFile = "term_project/src/main/java/com/termproject/Singleton/packages.txt";
	private static final ArrayList<Package> TripList = null;
    /**
     * List of travel packages
     */
    ArrayList<Package> packageList = new ArrayList<>();

    /**
     * Private constructor for the singleton instance of the class.
     */
    private TripList() {
        loadPackagesFile();
    }

    /**
     * Loads information for each package object from the packages file and adds it to an ArrayList.
     */
    @SuppressWarnings("unchecked")
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

               TransportType transport = null;
                switch (transportName) {
                    case "Helicopter":
                        transport = (TransportType) new Helicopter();
                        break;
                    case "Limousine":
                        transport = (TransportType) new Limousine();
                        break;
                    case "PrivateJet":
                        transport = (TransportType) new PrivateJet();
                        break;
                    case "Yacht":
                        transport = (TransportType) new Yacht();
                        break;
                }
                packageList.add(new Package(price, hoursOfTravelTime, travelsFrom, travelsTo, transport));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the singleton instance of the PackageList class.
     *
     * @return The instance of the PackageList class.
     */
    public static TripList getInstance() {
        return uniqueInstance;
    }

    /**
     * Returns the list of packages.
     *
     * @return The list of packages.
     */
    public ArrayList<Package> getPackageList() {
        return TripList;
    }
}