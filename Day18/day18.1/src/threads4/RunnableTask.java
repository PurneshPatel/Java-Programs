package threads4;

public class RunnableTask implements Runnable {
	//RuunableTask IS NOT A Thread , it's simply a Runnable (i.e provides B.L , imple of run method)
	

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " strted exec ");
		try {
			// B.L : test concurrency : for loop
			for (int i = 0; i < 10; i++) {
				System.out.println("Exec counter #" + i + " exec by " + Thread.currentThread());
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " completed exec ");
	}

}
