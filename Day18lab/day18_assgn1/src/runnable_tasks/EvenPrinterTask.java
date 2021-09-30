package runnable_tasks;
import static java.lang.Thread.currentThread;


public class EvenPrinterTask implements Runnable {
	private int start , end;
	

	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("ctor of "+getClass().getName()+" invoked by "+currentThread().getName());
	}


	@Override
	public void run() {
		System.out.println(currentThread().getName()+" strted ");
		try {
			for(int i=start;i<=end;i++)
			{
				if(i % 2 ==0)
					System.out.println("Even No "+i+" invoked by "+currentThread().getName());
			//	Thread.sleep(35);
			}
		} catch (Exception e) {
			System.out.println("err in "+currentThread().getName()+" exc "+e);
		}
		System.out.println(currentThread().getName()+" over ");

	}

}
