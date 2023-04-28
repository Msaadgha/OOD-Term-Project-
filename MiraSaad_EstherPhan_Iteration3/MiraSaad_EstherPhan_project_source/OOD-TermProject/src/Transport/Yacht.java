package Transport;
import Decorator.booking;

public class Yacht extends booking {
	
	private String name;
	private int yachtNum;
	private int capacity;
	private String captain;
	private double costPerPerson;
	
	
	
	
	public Yacht(String name, int yachtNum, int capacity, String captain, double costPerPerson) {
		name = this.name;
		yachtNum = this.yachtNum;
		capacity = this.capacity;
		captain = this.captain;
		costPerPerson = this.costPerPerson;
	}
	

	//getters
	//get name of Yacht
	public String getName() {
		return name;
	}
	
	//identification of Yacht
	public int yachtNum() {
		return yachtNum;
	}
	
	//get location of Yacht rental
	public int capacity() {
		return capacity;
	}
	
	public String captain() {
		return captain;
	}
	
	public double costPerPerson() {
		return costPerPerson;
	}
	

	
	
}
