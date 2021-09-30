package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.vehicles.Vehicle;

/*
 * Add manufacturing date to a Vehicle.
 * Accept all the details of vehicle from user n create vehicle instance
 * n display it's details using toString
 */
public class Test2 {

	public static void main(String[] args) /* throws ParseException */ {
		try (Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
			System.out.println("Enter vehicle details regno clr price dt(yr-mon-day)");
			Vehicle v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			System.out.println(v1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd.....");

	}

}
