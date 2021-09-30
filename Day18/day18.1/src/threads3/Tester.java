package threads3;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());// main , 5 , main
		// invoke NeWThread's constr to create n start the thrds
		NewThread t1 = new NewThread("one");
		NewThread t2 = new NewThread("two");
		NewThread t3 = new NewThread("three");
		NewThread t4 = new NewThread("four");// 1 (main) + 4 child thrds
		for (int i = 0; i < 10; i++) {
			System.out.println("Exec counter #" + i + " exec by " + Thread.currentThread());
			Thread.sleep(300);
		}
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println(t1.isAlive()+" "+t4.isAlive());//t t
		t1.join();//main thrd is waiting for t1 to complete exec
		t2.join();
		t3.join();
		t4.join();//main thrd is waiting for t4 to complete exec
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main thread over.....");

	}

}
