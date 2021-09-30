package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

//state(data members)  : registrationNo : int , color : String , price : double
public class Vehicle {
	private int registrationNo;
	private String color;
	private double price;
	private Date manufactureDate;
	//add single copy of the SDF
	public static SimpleDateFormat sdf;//converter (string--->Date n Date---> string)
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	

	public Vehicle(int registrationNo, String color, double price, Date manufactureDate) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", color=" 
	+ color + ", price=" + price + "manufactured on "+sdf.format(manufactureDate); //formatted string
	}

	@Override
	public boolean equals(Object anotherObject) {
		// unique ID for testing equality : regNo (Primary key) & clr
		System.out.println("in vehicle equals...");
		if (anotherObject instanceof Vehicle) {
			Vehicle v = (Vehicle) anotherObject;// down casting
			return this.registrationNo == v.registrationNo && color.equals(v.color);
		}
		return false;
	}

}
