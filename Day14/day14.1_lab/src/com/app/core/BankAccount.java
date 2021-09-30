package com.app.core;

import java.time.LocalDate;

import custom_exception.AccountHandlingException;

import static utils.AccountValidation.validateBalance;

public class BankAccount {
	/*
	 * acctNo(int : PK) , customer name , type(enum) , balance , opening date (Use
	 * Java 8 API : java.time.LocalDate)
	 */
	private int acctNo;
	private String customerName;
	private AccountType type;
	private double balance;
	private LocalDate creationDate;
	public BankAccount(int acctNo, String customerName, AccountType type, double balance, LocalDate creationDate) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + ", creationDate=" + creationDate + "]";
	}
	//B.L withdraw , deposit , funds transfer , apply interest (Simple int)
	public void deposit(double amount)
	{
		balance += amount;
	}
	public void withdraw(double amount) throws AccountHandlingException
	{
		validateBalance(balance-amount);
		balance -= amount;
	}
	
	public void transferFunds(BankAccount dest,double amount)  throws AccountHandlingException
	{
		//withdraw from src a/c
		this.withdraw(amount);
		//deposit into dest a/c
		dest.deposit(amount);
		
	}
	//apply interest (Simple interest)
	public void applyInterest(double interestRate,int periodInYears)
	{
		double simpleInterest=(balance*periodInYears*interestRate)/100;
		deposit(simpleInterest);
	}
	public int getAcctNo() {
		return acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public AccountType getType() {
		return type;
	}
	public double getBalance() {
		return balance;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	

}
