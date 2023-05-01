package Decorator;

import Transport.PrivateJet;

public class pjFlight {
	private String origin; //location of takeoff
	private String destination; //destination of trip
	private String dep_time; //time the helicopter or private jet takes off
	private String arr_time; //time of arrival at the destination
	private String dateOfFlight; //date of the flight
	private PrivateJet aircraft;
	
	
	//setter method
	public pjFlight(String origin, String destination, String dateOfFlight, PrivateJet aircraft) {
		origin = this.origin;
		destination = this.destination;
		dateOfFlight = this.dateOfFlight;
		aircraft = this.aircraft;
	}
	
	@Override 
	public String toString() {
		String result = "";
		result += "\n\n**********Private Jet Flight Information*************\n"
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
