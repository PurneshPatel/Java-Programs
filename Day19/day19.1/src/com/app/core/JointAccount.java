package com.app.core;

//shared reosurce : between multiple customers represented by thrds
public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}
	//update balance
	//orig bal 10000  amount : 1000
	public synchronized void updateBalance(double amount) throws InterruptedException
	{
		System.out.println("update strted by "+Thread.currentThread().getName());
		balance = balance + amount; //11K
		//think time of the user !
		Thread.sleep(20);
		System.out.println("cancelling updates....");
		balance =balance-amount;//10K
		System.out.println("update over by "+Thread.currentThread().getName());//10K
	}
	
	//check balance
	public synchronized double checkBalance() throws InterruptedException
	{
//		Thread.sleep(26);
		System.out.println("checking balance by "+Thread.currentThread().getName());
		return balance;
	}
}
