package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;
import static utils.ValidationRules.checkForDup;
import custom_exception.VehicleHandlingException;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create data structure
			Vehicle[] vehicles = new Vehicle[100];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Options 1. Add Vehicle 2. Display 3. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : regno clr price");
//							int regNo=sc.nextInt();
//							String clr=sc.next();
//							double price=sc.nextDouble();
							// Tester has to invoke method of ValidationRules : static
							Vehicle v = checkForDup(vehicles, sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
							// not dup
							vehicles[counter++] = v;
							System.out.println("vehicle details added....");
						} else
							throw new VehicleHandlingException("Showrooom full!!!!");

						break;
					case 2:
						System.out.println("Showroom Details");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;

					case 3:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
