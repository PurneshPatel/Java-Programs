package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Emp;
import static com.app.core.Department.*;
import static com.app.core.Emp.sdf;

/*
 * 1. Create empty AL to store emp info.
		Emp : id , name , salary , deptId(enum),joinDate (Date)
 */
public class Tester1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// Create empty AL to store emp info.
			ArrayList<Emp> empList = new ArrayList<>();// size=0,capa=10
			// 2. Accept emp details from user n store it in AL
			System.out.println("Enter emp details :  id , name , salary , deptId, joinDate(day-mon-yr)");
			// AL API : add
			empList.add(new Emp(sc.nextInt(), sc.next(), sc.nextDouble(), valueOf(sc.next().toUpperCase()),
					sdf.parse(sc.next())));
			System.out.println(empList.size());// 1
			// AL : toString
			System.out.println("Emp List contents " + empList);// [e1's details]
			/*
			 * 3. Fetch Emp details from AL i/p : emp id o/p : in case of success : display
			 * emp details o.w throw custom exception
			 * 1st part : if emp id is valid --"present" or "absent"
			 * 
			 */
			System.out.println("Enter emp id ");
			Emp e=new Emp(sc.nextInt());
			//API of ArrayList<E>
			//public boolean contains(Object o) : rets true if the elem is found , o.w false
			//What should be the argument of contains ?
			//Generic type of the ArrayList (E)
			//Internally , contains will call : E's equals method
			System.out.println(empList.contains(e)?"Present":"Absent");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
