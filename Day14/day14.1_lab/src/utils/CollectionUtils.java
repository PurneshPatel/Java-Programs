package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.AccountType;
import com.app.core.BankAccount;
import static com.app.core.AccountType.*;
import static java.time.LocalDate.parse;

public class CollectionUtils {
//add a static method to populate bank accts in a map
	public static HashMap<Integer, BankAccount> populateMap() {
		// create empty HashMap
		HashMap<Integer, BankAccount> accts = new HashMap<>();
		// public BankAccount(int acctNo, String customerName, AccountType type, double
		// balance, LocalDate creationDate) {

		System.out.println(accts.put(101, new BankAccount(101, "Riya", SAVING, 10000, parse("2010-01-01"))));// null
		System.out.println(accts.put(10, new BankAccount(10, "Mihir", SAVING, 18000, parse("2010-11-01"))));// null
		System.out.println(accts.put(55, new BankAccount(55, "Shubham", FD, 90000, parse("2009-06-21"))));// null
		System.out.println(accts.put(15, new BankAccount(15, "Rama", LOAN, 15000, parse("2013-09-15"))));// null
		System.out.println(accts.put(101, new BankAccount(101, "Kirti", SAVING, 11000, parse("2012-12-01"))));// not
																												// null
																												// =>
																												// Riya's
																												// details
		System.out.println(accts.putIfAbsent(101, new BankAccount(101, "Rucha", SAVING, 20000, parse("2011-01-01"))));// not
																														// null
																														// :
																														// rets
																														// kirti's
																														// dtls
		System.out.println(accts);//map will contain these details : {Mihir,Shubham,Rama,Kirti}
		System.out.println(accts.size());//4
		return accts;

	}
}
