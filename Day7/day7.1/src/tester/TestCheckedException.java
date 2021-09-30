package tester;

public class TestCheckedException {

	public static void main(String[] args) {
		try {
			System.out.println("Before");
			// add a delay of 5secs
			// javac forces handling of the checked exception
			Thread.sleep(5000);//May throw java.lang.InterruptedException : chked exc : 
			System.out.println("After");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd...");

	}

}
