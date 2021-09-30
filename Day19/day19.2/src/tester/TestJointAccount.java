package tester;

import com.app.core.JointAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdateBalanceTask;

public class TestJointAccount {

	public static void main(String[] args) throws InterruptedException{
		// create single instance of the joint account
		JointAccount jointAccount=new JointAccount(10000);
		//create tasks by sharing joint a/c --attach thrds to these tasks 
		Thread t1=new Thread(new UpdateBalanceTask(jointAccount), "cust1");
		Thread t2=new Thread(new CheckBalanceTask(jointAccount),"cust2");
		t1.start();
		t2.start();
		System.out.println("main waiting for child thrds...");
		t1.join();
		t2.join();
		System.out.println("main thread over....");

	}

}
