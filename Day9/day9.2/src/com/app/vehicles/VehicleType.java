package com.app.vehicles;

public enum VehicleType {
	BIKE,SCOOTER,SUV,SEDAN,CAR,VAN;
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
