package Transport;
import Decorator.booking;

public class Limousine extends booking {

	private String make;
	private String model;
	private double costPerHour;
	private int capacity;
	private String driverName;
	
	
	public Limousine(String make, String model, double costPerHour, int capacity, String driverName) {
		make = this.make;
		model = this.model;
		costPerHour = this.costPerHour;
		capacity = this.capacity;
		driverName = this.driverName;
	}
	
	//getters
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	
	public double getCostPerHour() {
		return costPerHour;
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	
	public String driverName() {
		return driverName;
	}
	
	
	
}
