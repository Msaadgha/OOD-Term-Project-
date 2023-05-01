package Decorator;

import Transport.Limousine;

public class limobooking {

	
	private String pickupLocation; //location of pickup
	private String dropoffLocation; //destination of dropoff
	private String pickup_time; //pickup time
	private String dateOfPickup; //date of the pickup
	private Limousine num;
	
	//setter method
	public limobooking(String pickupLocation, String dropoffLocation, String pickup_time, String dateOfPickup, Limousine num) {
		pickupLocation= this.pickupLocation;
		dropoffLocation = this.dropoffLocation;
		dateOfPickup = this.dateOfPickup;
		
	}
	
	@Override 
	public String toString() {
		String result = "";
		result += "\n\n**********Limosine Information*************\n"
				+ "\tPick-Up Location: " + pickupLocation
				+ "\n\tDrop-Off Location " + dropoffLocation 
				+  "\nDate of Pick-Up: " + dateOfPickup + " and the time of pickup is at: " + pickup_time
				+ "\n with limosine num: " + num;
		return result;
	}
	
	public void schedule(String pickup_time) {
		pickup_time = this.pickup_time;
	}
	
	
	

}
