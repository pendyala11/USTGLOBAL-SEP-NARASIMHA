package objectClass;

public class Car {
     int cost;
     String brand;
     String color;
	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
     
	public int hashcode() {
		return cost ;
	}
	

	public String toString() {
		return "  cost  "+cost+ " car name is "+  brand  + " color is " + color ;
	}
}
