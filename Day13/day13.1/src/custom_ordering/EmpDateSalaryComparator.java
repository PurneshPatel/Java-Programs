package custom_ordering;

import java.util.Comparator;

import com.app.core.Emp;

public class EmpDateSalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		System.out.println("in compare :date n sal");
		// compare by date
		int retValue = o1.getJoinDate().compareTo(o2.getJoinDate());
		if (retValue == 0) {
			// sal based comparison
//		   if(o1.getSalary()< o2.getSalary())
//			   return -1;
//		   if(o1.getSalary()== o2.getSalary())
//			   return 0;
//		   return 1;
			return ((Double) o1.getSalary()).compareTo(o2.getSalary());

		}
		return retValue;
	}

}
