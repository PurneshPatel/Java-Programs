package tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Emp;

import static utils.CollectionUtils.populateEmpData;

public class TestIterator4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp> list = populateEmpData();
			System.out.println("List contents ");
			for (Emp e : list)
				System.out.println(e);

			System.out.println("Enter threshold salary");
			double sal = sc.nextDouble();
			// attach explicit  iterator : before the 1st elem.
			Iterator<Emp> itr = list.iterator();
			while (itr.hasNext())
				if (itr.next().getSalary() > sal)
					itr.remove();
			System.out.println("List contents after removal");
			for (Emp e : list)
				System.out.println(e);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
