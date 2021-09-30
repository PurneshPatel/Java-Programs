package tester;

import static utils.ValidationRules.convertDate;
import static utils.ValidationRules.validateCategory;
import static utils.ValidationRules.validateEmail;
import static utils.ValidationRules.validatePassword;
import static utils.ValidationRules.findCustomerByEmail;

import java.util.Scanner;

import customer.Customer;

public class Tester3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Customer[] customer = new Customer[100];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Optiojn 1.Regaister Customer 2. Link Aadhar card 3. Dispaly Services"
						+ "4.Change Paln 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						double amount = 0;
						System.out.println(
								"Enter customer details : name, email,password,regAmt, dob(dd-MM-yyyy) category");
						Customer c1 = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
								amount = (sc.nextDouble()), convertDate(sc.next()),
								validateCategory(amount, sc.next()));
						customer[counter++] = c1;
						break;
					case 2:
						System.out.println("enter email to link your aadhar card");
						//invoke a method to ckt if customer with specified email exits
						c1=findCustomerByEmail(sc.next(),customer);
						System.out.println("Entef aadhar card no n creation date");
						c1.linkAadharCard(sc.next(), sc.next());
						break;
					case 5:
						for (Customer c : customer)
							if (c != null)
								System.out.println(c);
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}

	}

}
