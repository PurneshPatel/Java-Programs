package tester;

import java.util.Scanner;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;

public class TestOrganization {
	public static void main(String[] args) {

		System.out.println("Enter the array length:");
		Scanner sc = new Scanner(System.in);
		Emp[] emp = new Emp[sc.nextInt()];
		int choice;
		int counter = 0;
		boolean flag = false;
		while (!flag) {
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Hire Mgr
				if (counter < emp.length) {
					System.out.println("Enter the Manager details Id, name, deptId, basic,perfBonus");
					emp[counter++] = new Mgr(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
				} else {
					System.out.println("------count is full------");
				}
				break;
			case 2: // Hire Worker
				if (counter < emp.length) {
					System.out.println("Enter the worker employee Id, name, deptId, basic, hourlyWorked, hourlyRate");
					emp[counter++] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(),
							sc.nextDouble());
				} else {
					System.out.println("No more vacancies available");
				}
				break;
			case 3:// display details
				for (Emp e : emp) {
					if (e != null) {
						System.out.println(e);
						System.out.println("Net Salary: " + e.computeNetSalary());
						if (e instanceof Mgr)
							System.out.println("Perfomance Bonus " + ((Mgr) e).getperfomanceBonus());
						else if (e instanceof Worker)
							System.out.println("Hourly Rate-" + ((Worker) e).getHourlyRate());
					}
				}
				break;
			case 10:
				flag = true;
				break;
			}
		}
		sc.close();
	}
}
