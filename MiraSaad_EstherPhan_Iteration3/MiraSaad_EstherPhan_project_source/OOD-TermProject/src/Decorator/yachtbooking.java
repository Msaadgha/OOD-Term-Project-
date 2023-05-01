package Decorator;

import Transport.Yacht;

public class yachtbooking {

	
	private String portOfOrigin; //location of yacht pickup
	private String portOfDestination; //destination of yacht 
	private String month; //time the helicopter or private jet takes off
	private String year; //time of arrival at the destination
	private Yacht sNum;
	@SuppressWarnings("unused")
	private int costPerPerson;
	
	
	//setter method
	public yachtbooking(String portOfOrigin, String portOfDestination, String month, String year, Yacht sNum) {
		portOfOrigin = this.portOfOrigin;
		portOfDestination = this.portOfDestination;
		year = this.year;
		month =this.month;
		sNum = this.sNum;
		
	}
	
	@Override 
	public String toString() {
		String result = "";
		result += "\n\n**********Yacht Flight Information*************\n"
				+ "\tMonth of Yacht Trip Route: " + month 
				+ "\n\tYear of Yacht Trip Route" + year + 
				" from " + portOfOrigin + " to " + portOfDestination;
		return result;
	}
	
	
	
	
}

