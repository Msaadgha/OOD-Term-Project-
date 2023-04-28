package Decorator;

import Transport.Helicopter;

//time of takeoff and arrival for both helicopter and private jet//

public class Flight {
	private String origin; //location of takeoff
	private String destination; //destination of trip
	private String dep_time; //time the helicopter or private jet takes off
	private String arr_time; //time of arrival at the destination
	private String dateOfFlight; //date of the flight
	private Helicopter aircraft;
	
	
	//setter method
	public Flight(String origin, String destination, String dateOfFlight, Helicopter aircraft) {
		origin = this.origin;
		destination = this.destination;
		dateOfFlight = this.dateOfFlight;
		aircraft = this.aircraft;
	}
	
	@Override 
	public String toString() {
		String result = "";
		result += "\n\n**********Helicopter Flight Information*************\n"
				+ "\tDate of Flight: " + dateOfFlight 
				+ "\n\tTime of Flight: " + dep_time + " to "
				+  arr_time;
		return result;
	}
	
	public void schedule(String arr_time, String dep_time) {
		arr_time = this.arr_time;
		dep_time = this.dep_time;
	}
	

}
