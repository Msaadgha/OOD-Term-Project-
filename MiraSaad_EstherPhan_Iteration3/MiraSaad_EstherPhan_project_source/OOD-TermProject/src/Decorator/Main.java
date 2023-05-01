package Decorator;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import Factory.RWStrategy;
import Factory.WriteFactory;
import People.TravelAgent;
import Singleton.AgentList;
import Singleton.PersonList;
import Trip.Trip;

public class Main {
	private static Trip activeTrip;
    @SuppressWarnings("unused")
	private final PersonList people = PersonList.getInstance();
    private static final AgentList agents = AgentList.getInstance();
    static ArrayList<TravelAgent> listOfAgents = agents.getAgentList();
    private static final Scanner scan = new Scanner(System.in);
    private static TravelAgent currentAgent = null;
    private static final WriteFactory writeFactory = new WriteFactory();
    private static RWStrategy readStrategy;
    private static String dataFormat;
    private static ArrayList<Trip> tripList;
    private static final String line = "---";
    private static void loadConfigFile() {
        Properties props = new Properties();
		dataFormat = props.getProperty("PERSISTENCE_FORMAT");
		writeFactory.createStrategy(dataFormat);

    }
    private static void logIn(){
        System.out.println("\n\n" + line + "\nWelcome to TravelCom Booking!\n");
        while (true) {
            System.out.print("Please enter your username and any other traveler(s): ");
            String username = scan.nextLine();
            if (username.equals("list")){
                for (TravelAgent agent : listOfAgents){
                    System.out.println(agent.getName() + ": " + agent.getUsername());
                }
            } else {
                for (TravelAgent agent : listOfAgents) {
                    if (agent.getUsername().equals(username)) {
                        currentAgent = agent;
                        System.out.println("\n\nWelcome, " + currentAgent.getName() + "!");
                        return;
                    }
                }
                System.out.println("Username not found!!! Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        loadConfigFile();
        System.out.println("System configured to use " + dataFormat);
        logIn();
        if (currentAgent == null) {
            doExit("Login failed.");
        }
        System.out.println(line);
        int newOrExisting = mainMenu();
        if (newOrExisting == 1) {
            startNewTrip();
        } else if (newOrExisting == 2) {
            tripSelect();
        } else {
            doExit("Invalid value for newOrExisting.");
        }
        if (activeTrip != null) {
            modifyTrip();
        } else {
            doExit("Active trip set!!");
        }
    }
    private static void doExit(String message) {
        System.out.println(message);
        scan.close();
        System.exit(-1);
    }
    private static int mainMenu() {
        while (true) {
            System.out.println("Choose an option below:\n");
            System.out.println("\t1) Start a new trip");
            System.out.println("\t2) an existing trip");
            System.out.println("\n" + line);
            System.out.print("Enter an option: ");
            String selection = scan.nextLine();

            if (selection.equals("1")) {
                return 1;
            } else if (selection.equals("2")) {
                return 2;
            } else {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }
    private static void tripSelect() {
        tripList = readStrategy.getAllTrips();

        while (true) {
            printTrips();
            System.out.print("\n" + line + "\nPlease enter your ID of the trip you'd like to choose: ");
            if (scan.hasNextInt()) {
                int tripInput = scan.nextInt();
                scan.nextLine();
                for (Trip trip : tripList) {
                    if (trip.getUniqueId() == tripInput) {
                        activeTrip = trip;
                        return;
                    }
                }
                System.out.println("Invalid input!! Please try again.\n");
            } else {
                String tripInput = scan.nextLine();
                if (tripInput.equalsIgnoreCase("new")) {
                    startNewTrip();
                    return;
                } else {
                    System.out.println("Invalid input!! Please try again.");
                }
            }
        }
    }
    private static void modifyTrip() {
        System.out.println(line);
        while (true) {
            System.out.println("\n\n" + line + "\nWorking on trip #" + activeTrip.getUniqueId());
            System.out.println(line + "\n");
            System.out.println("Options:");
            System.out.println("\t3) Save this trip");
            System.out.println("\t4) Quit");
            System.out.print(line + "\nEnter an option: ");

            scan.nextLine();
           
        }
    }

    private static void printTrips() {
        System.out.println(line);
        System.out.println("Available trips:\n");
        for (Trip trip : tripList) {
            System.out.println("\t" + trip);
        }
    }
    private static void startNewTrip() {
        activeTrip = new Trip();
        activeTrip.setAgent(currentAgent);
    }
}

	
