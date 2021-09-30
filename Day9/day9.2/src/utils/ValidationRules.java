package utils;

//import static member : SDF from Vehicle class
import static com.app.vehicles.Vehicle.sdf;

import java.text.ParseException;

import com.app.vehicles.Vehicle;
import com.app.vehicles.VehicleType;

import custom_exception.VehicleHandlingException;

public class ValidationRules {
//add a static method to chk for dup vehicle
	public static Vehicle checkForDup(Vehicle[] vehicleData, int regNo, String color, double price,
			String manufactureDate,String vehicleType) throws VehicleHandlingException,ParseException {
		// create vehicle type of object holding regNo n clr
		Vehicle newVehicle = new Vehicle(regNo, color, price, sdf.parse(manufactureDate)
				,VehicleType.valueOf(vehicleType.toUpperCase()));// all fields
		// for-each : equals of Vehicle class : Vehicle ref
		for (Vehicle v : vehicleData)
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Dup vehicle detected!!!!!!");
		System.out.println("no dup detected....");
		return newVehicle;

	}

}
