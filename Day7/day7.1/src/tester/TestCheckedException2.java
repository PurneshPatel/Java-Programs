package tester;

public class TestCheckedException2 {

	public static void main(String[] args)  throws InterruptedException{

		System.out.println("Before");
		// add a delay of 5secs
		// javac forces handling of the checked exception
		Thread.sleep(5000);// May throw java.lang.InterruptedException : chked exc :
		System.out.println("After");

		System.out.println("main cntd...");

	}

}
