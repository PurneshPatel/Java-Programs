package threads1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());// main , 5 , main
		// invoke NeWThread's constr to create n start the thrds
		NewThread t1 = new NewThread("one");
		NewThread t2 = new NewThread("two");
		NewThread t3 = new NewThread("three");
		NewThread t4 = new NewThread("four");// 1 (main) + 4 child thrds
		for (int i = 0; i < 20; i++) {
			System.out.println("Exec counter #" + i + " exec by " + Thread.currentThread());
			Thread.sleep(700);
		}
		System.out.println("main thread over.....");

	}

}
