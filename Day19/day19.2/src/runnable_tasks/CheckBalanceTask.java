package runnable_tasks;

import com.app.core.JointAccount;
import static java.lang.Thread.*;

public class CheckBalanceTask implements Runnable {
	private JointAccount account;

	public CheckBalanceTask(JointAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			while (true) {
				synchronized (account) {
					// check balance
					double balance = account.checkBalance();
					if (balance != 10000) {
						// error
						System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!");
						// stop the app (terminating JVM)
						System.exit(1);

					}
					System.out.println("Balance " + balance);
				}

				// add a delay for causing context switching (better testing!)
				 sleep(53);
			}
		} catch (Exception e) {
			System.out.println("err in " + currentThread().getName() + " exc " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
