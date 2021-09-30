package itc_with_sleep;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while (dataReady) //while data is ready : producer should get blocked
			Thread.sleep(50);
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		//toggle dataReady
		dataReady=true;
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while(!dataReady) //while data is not ready : consumer thrd should get blocked
			Thread.sleep(300);
		// consume data
		System.out.println("Read  Data " + e);
		
		System.out.println("r exited --- " + Thread.currentThread().getName());
		//toggle the flag
		dataReady=false;
		
		return e;
	}

}
