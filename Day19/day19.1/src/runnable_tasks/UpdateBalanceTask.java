package runnable_tasks;

import com.app.core.JointAccount;
import static java.lang.Thread.*;

public class UpdateBalanceTask implements Runnable {
	private JointAccount account;

	public UpdateBalanceTask(JointAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			while (true) {
				account.updateBalance(1000);
				// add a delay for causing context switching (better testing!)
		//		sleep(100);
			}
		} catch (Exception e) {
			System.out.println("err in " + currentThread().getName() + " exc " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
