package itc_with_wait_notify;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while (dataReady) // while data is ready : producer should get blocked
			wait();// P : Blocked on wait : outside the monitor
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		// toggle dataReady
		dataReady = true;
		notify();//Producer sending a wake up call to ---> Consumer
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while (!dataReady) // while data is not ready : consumer thrd should get blocked
			wait();// C : Blocked on wait : outside the monitor
		// consume data
		System.out.println("Read  Data " + e);

		System.out.println("r exited --- " + Thread.currentThread().getName());
		// toggle the flag
		dataReady = false;
		notify();//Consumer ---> Producer
		return e;
	}

}
