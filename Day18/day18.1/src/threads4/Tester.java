package threads4;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// main , 5 , main
		// invoke NeWThread's constr to create n start the thrds
		RunnableTask task = new RunnableTask();// how many runnable thrds exists in the JVM ? : 1(main)
		// Create thrds by attaching runnable task
		// Thread(Runnable inst , String name)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		Thread t4 = new Thread(task, "four");// how many runnable thrds exists in the JVM ? 1(main) n child thrds : NEW
		
		//start child thrds
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	//	t2.start();//it's alrdy RUNNABLE : IllegalThrdStateExc
		for (int i = 0; i < 10; i++) {
			System.out.println("Exec counter #" + i + " exec by " + Thread.currentThread());
			Thread.sleep(300);
		}
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println(t2.isAlive() + " " + t3.isAlive());// t t
		t1.join();// main thrd is waiting for t1 to complete exec
		t2.join();
		t3.join();
		t4.join();// main thrd is waiting for t4 to complete exec
		System.out.println(t2.isAlive() + " " + t3.isAlive());// f f
	//	t1.start();//IllegalThrdStateExc
		System.out.println("main thread over.....");

	}

}
