package tester;

import static utils.ValidationRules.*;


import java.util.Scanner;

import customer.Customer;
public class Tester1 {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) 
		{
			System.out.println("Enter Customer Details : name, email, password, registrationAmount, dob(dd-MM-yyyy)");
			Customer c1 =new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()), validateRegAmount(sc.nextDouble()), convertDate(sc.next()));
			System.out.println(c1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
