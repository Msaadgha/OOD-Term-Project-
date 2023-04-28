package Transport;

import Decorator.booking;

public class Helicopter extends booking{
		
		private String name;
		private int planeNumber;
		private int capacity;
		private String pilot;
		private double costPerHour;
		
		
		
		//setters
		public Helicopter(String name, int planeNumber, int capacity, String pilot, double costPerHour) {
			name = this.name;
			planeNumber = this.planeNumber;
			capacity = this.capacity;
			pilot = this.pilot;
			costPerHour = this.costPerHour;
		}
		

		//getters
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
			return pilot;
		}
		
		public double getCostPerHour() {
			return costPerHour;
		}
		
		public void setCostPerHour(int howmanyhours) {

			costPerHour = (costPerHour * howmanyhours);
			
		}
		
		@Override
		public String toString() {
			String result = "";
			result += "/n***********Helicopter Information******************/n" 
					+ "\t\tName of Helicopter: " + name 
					+ "\nHelicopter Serial Number: " + planeNumber 
					+ "\nCapacity/People: " + capacity 
					+ "\n\tName of Pilot: " + pilot
					+ "Cost Per Hour " + costPerHour;
					return result;
		}
		
}

