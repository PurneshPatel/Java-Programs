package threads5;

import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(currentThread().getName() + " strted ");
		Thread t1 = new Thread(() -> {
			System.out.println(currentThread().getName() + " strted ");
			try {
				sleep(5000);
				System.out.println("2");
			} catch (InterruptedException e) {
				System.out.println("err " + e);
			}
			System.out.println(currentThread().getName() + " over ");
		}, "t1");
		t1.start();
		System.out.println("1");
		t1.join();//main : wait till t1 is over state : Blocked on join
		System.out.println("main thrd over.....");

	}

}
