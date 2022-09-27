package problem;

public class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name + " : " + "$" + price ;
	}
}
