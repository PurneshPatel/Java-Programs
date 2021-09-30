

public class Vehicle {
	private int registrationNo;
	private String colour;
	private double price;

	public Vehicle(int registrationNo, String colour, double price) {
		super();
		this.registrationNo = registrationNo;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public String toString() {
		return registrationNo + " " + colour + " " + price;
	}
	
	

}
