package Transport;

import Decorator.booking;

public class PrivateJet extends booking{
	

	private String name;
	private int planeNumber;
	private int capacity;
	private String pilot;
	private double costPerHour;
	

	
	public PrivateJet(String name, int planeNumber, int capacity , String pilot, double costPerHour) {
		name = this.name;//name of aircraft
		planeNumber = this.planeNumber; //the planes serial number 
		capacity = this.capacity; //capacity of aircraft
		pilot = this.pilot; // pilot of aircraft
		costPerHour = this.costPerHour; //per hour rental
}
	

	
	public String getName() {
		return name; 
	}
	
	public int getPlaneNumber() {
		return planeNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getPilot() {
		return pilot; //name of pilot
	}
	
	public double GetCostPerHour() {
		return costPerHour; //the full cost of the private jet
	}
	
	
	public void setCostPerHour(int howmanyhours) {

		costPerHour = (costPerHour * howmanyhours);
		
	}
	public String toString() {
		String one = "Private Jet ID # of: " + name + " with pilot name: " + pilot;
		String two= "The number of people boarding the PrivateJet" + capacity + " and the cost is " + costPerHour;
		String three = "The Private Jet Serial Number is: " + planeNumber;
		return one + two + three;
	}
	
	
}
