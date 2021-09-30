package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.app.core.Emp;

public class TestEmpSorting3 {

	public static void main(String[] args) {
		try {
//get populated emp list from CollectionUtils
			ArrayList<Emp> empData = populateEmpData();
			System.out.println("Original list ");
			for (Emp e : empData)
				System.out.println(e);
			// display emp details sorted as per asc order of salary : custom ordering
			// Collections.sort(List<T> list, Comparator<T> comp
			// 1st arg : list to be sorted (AL/LL/Vector)
			// 2nd arg : Comparator instance (instance of the class that imple Comparator)
			// new Comparator<Emp>() => instance of the ano inner class that impl.
			// Comparator
			Collections.sort(empData, new Comparator<Emp>() {
				@Override
				public int compare(Emp o1, Emp o2) {
					System.out.println("in compare ano inner :date n sal");
					// compare by date
					int retValue = o1.getJoinDate().compareTo(o2.getJoinDate());
					if (retValue == 0) {
						// sal based comparison
						return ((Double) o1.getSalary()).compareTo(o2.getSalary());
					}
					return retValue;
				}
			});
			System.out.println("Sorted  list  as per emp's date n salary");
			for (Emp e : empData)
				System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
