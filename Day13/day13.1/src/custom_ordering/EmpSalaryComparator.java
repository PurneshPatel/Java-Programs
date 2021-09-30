package custom_ordering;

import java.util.Comparator;

import com.app.core.Emp;

public class EmpSalaryComparator implements Comparator<Emp> {
	@Override
	public int compare(Emp e1, Emp e2) {
		System.out.println("in compare...");
		if (e1.getSalary() < e2.getSalary())
			return -1;
		if (e1.getSalary() == e2.getSalary())
			return 0;
		return 1;

	}

}
