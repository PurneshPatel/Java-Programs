package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

//state(data members)  : registrationNo : int , color : String , price : double
public class Vehicle {
	private int registrationNo;
	private String color;
	private double price;
	private Date manufactureDate;
	//HAS-A : enum (weaker form of association)
	private VehicleType type;
	//HAS-A : inner class (stronger form of asso.) : Composition
	private DeliveryAddress address;//null
	
	//add single copy of the SDF
	public static SimpleDateFormat sdf;//converter (string--->Date n Date---> string)
	
	
	
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	

	public Vehicle(int registrationNo, String color, double price, Date manufactureDate,VehicleType type) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.type=type;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", color=" 
				+ color + ", price=" + price + "manufactured on " + sdf.format(manufactureDate) + " vehicle type "
				+ type; //formatted string
	}

	@Override
	public boolean equals(Object anotherObject) {
		// unique ID for testing equality : regNo (Primary key) 
		System.out.println("in vehicle equals...");
		if (anotherObject instanceof Vehicle) {
			Vehicle v = (Vehicle) anotherObject;// down casting
			return this.registrationNo == v.registrationNo ;
		}
		return false;
	}
	//add a method in the outer class to link delivery address to the purchased vehicle
	public void linkDeliveryAddress(String city,String state,String country,String zipCode,String phoneNo)
	{
		address=new DeliveryAddress(city, state, country, zipCode, phoneNo);
	}
	//inner class : non static nested class
	public class DeliveryAddress
	{
		private String city,state,country,zipCode,phoneNo;

		public DeliveryAddress(String city, String state, String country, String zipCode, String phoneNo) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
			this.phoneNo = phoneNo;
		}
		//toString

		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + ", phoneNo=" + phoneNo + "]";
		}
		
	}

}
