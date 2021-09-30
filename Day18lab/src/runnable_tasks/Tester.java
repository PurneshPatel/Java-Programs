package runnable_tasks;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter begin n end values of the range");
			int strt=sc.nextInt();
			int end=sc.nextInt();
			Thread t1=new Thread(new EvenPrinterTask(strt, end), "even");
			Thread t2=new Thread(new OddPrinterTask(strt, end),"odd");
			//t1 , t2  : NEW
			t1.start();
			t2.start(); //runnable
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			System.out.println("child thrds over... main thrd getting over!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
