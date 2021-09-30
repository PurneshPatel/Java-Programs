package utils;

import static customer.Customer.sdf;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import customer.Customer;
import customer.CustomerCategory;
import customer_exception.CustomerHandlingException;
import static customer.CustomerCategory.*;

public class ValidationRules {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;
	static {
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
		try {
			thresholdDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// add a static method to validate email
	public static String validateEmail(String em) throws CustomerHandlingException {
		if (em.contains("@") && em.endsWith(".com"))
			return em;// rets validated email to the caller
		// throw Throwable instance
		throw new CustomerHandlingException("Invalid email format!!!!!");
	}

	// add a static method to validate password
	public static String validatePassword(String password) throws CustomerHandlingException {
		if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH)
			throw new CustomerHandlingException("Invalid password length!!!!!");
		return password;
	}

	 // add static method for validating reg amount
	public static double validateRegAmount(double amount) throws CustomerHandlingException {
		if (amount % 500 != 0)
			throw new CustomerHandlingException("Invalid reg amount!!!!");
		return amount;
	}

	// add a static method to convert string ---> date
	public static Date convertDate(String dob) throws ParseException, CustomerHandlingException {

		Date d1 = sdf.parse(dob);// conversion
		// date conversion success
		if (d1.after(thresholdDate))
			throw new CustomerHandlingException("Invalid date!!!!!!!!");
		// date validation success
		return d1;// rets parsed n validated date to the caller

	}

	public static CustomerCategory validateCategory(double amount,String category) throws CustomerHandlingException {
		try {
			
			CustomerCategory chosenCategory=valueOf(category.toUpperCase());
			
			if(amount!=chosenCategory.getCharges())
				throw new CustomerHandlingException("Invalid Amount paid for chosen plan, Pay");
			
			return chosenCategory;
		} catch (IllegalArgumentException e) {
			StringBuilder sb = new StringBuilder("Invalid Category Chosen \n ");
			sb.append("Valid Categories : \n");
			sb.append(Arrays.toString(values()));
			//System.out.println(sb);
			throw new CustomerHandlingException(sb.toString());
		}
	}
	// add a method to find customer details by email
	public static Customer findCustomerByEmail(String email, Customer[] custs) throws CustomerHandlingException {
		//dome by customer,s equal
		//create customer instance by wrapping email(unique id)
		Customer c1= new Customer(email);
		for(Customer c: custs)
			if(c!=null && c.equals(c1))
				return c;
		throw new CustomerHandlingException("Customer not found : invaild id !!!!!!!");
	}

}
