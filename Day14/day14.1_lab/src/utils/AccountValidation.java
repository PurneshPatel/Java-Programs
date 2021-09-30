package utils;

import custom_exception.AccountHandlingException;

public class AccountValidation {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 1000;
	}

//add static method for validating min balance condition
	public static double validateBalance(double balance) throws AccountHandlingException
	{
		if (balance < MIN_BALANCE)
			throw new AccountHandlingException("Insufficient Balance !!!!!!");
		return balance;
			
	}
}
