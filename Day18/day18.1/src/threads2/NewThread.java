package threads2;

public class NewThread extends Thread {
	// NewThread IS-A Thread
	public NewThread(String thrdName) {
		// Thread(String name)
		super(thrdName);// NEW
		// Thread class method : public void start()
		start();// RUNNABLE (rdy or running)

	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(getName() + " strted exec ");
		try {
			// B.L : test concurrency : for loop
			for (int i = 0; i < 10; i++) {
				System.out.println("Exec counter #" + i + " exec by " + Thread.currentThread());
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread() + " exc " + e);
		}
		System.out.println(getName() + " completed exec ");
	}

}
