package tester;

import static com.app.core.Department.valueOf;
import static com.app.core.Emp.sdf;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Emp;

import custom_exception.EmpHandlingException;

public class EmpManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable D.S
			ArrayList<Emp> emps = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options : 1. Add Emp Details 2.Display All Emp Details 3. Get Specified Emp details" + "100. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter emp details :  id , name , salary , deptId, joinDate(day-mon-yr)");
						// AL API : add
						emps.add(new Emp(sc.nextInt(), sc.next(), sc.nextDouble(), valueOf(sc.next().toUpperCase()),
								sdf.parse(sc.next())));
						break;
					case 2:
						System.out.println("Emp Details");
						for (Emp e : emps)//0 --size-1
							System.out.println(e);							
						break;
					case 3: System.out.println("Enter emp id , to fecth details");
					//indexOf , get
					   int index=emps.indexOf(new Emp(sc.nextInt()));
					   if(index == -1)
						   throw new EmpHandlingException("Invalid emp id : Emp not found!!!!!");
					   //emp id valid
					   System.out.println("Emp details "+emps.get(index));
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// clear off pending inputs from scanner
				sc.nextLine();
			}

		}

	}

}
