package threads5;

import static java.lang.Thread.*;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(currentThread().getName() + " strted ");
		Thread t1 = new Thread(() -> {
			System.out.println(currentThread().getName() + " strted ");
			try {
				sleep(5000);//t1 : Blocked on sleep 
				System.out.println("2");
			} catch (InterruptedException e) {
				System.out.println("err in "+currentThread().getName() +" "+ e);
			}
			System.out.println(currentThread().getName() + " over ");
		}, "t1");
		t1.start();
		System.out.println("1");
		t1.join(2000);//main : wait till t1 is over state or tmout elapsed : Blocked on join
		System.out.println("3");
		System.out.println("main sending interrupt....");
		t1.interrupt();//main is sending interrupt signal to t1
		t1.join();//main waiting for t1 to complete exec : indefinitley !
		System.out.println("main thrd over.....");

	}

}
