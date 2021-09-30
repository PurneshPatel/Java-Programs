package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Emp;

import custom_ordering.EmpSalaryComparator;

public class TestEmpSorting1 {

	public static void main(String[] args) {
		try {
//get populated emp list from CollectionUtils
			ArrayList<Emp> empData = populateEmpData();
			System.out.println("Original list ");
			for(Emp e : empData)
				System.out.println(e);
			//display emp details sorted as per asc order of salary : custom ordering
			//Collections.sort(List<T> list, Comparator<T> comp
			//1st arg : list to be sorted (AL/LL/Vector)
			//2nd arg : Comparator instance (instance of the class that imple Comparator)
			Collections.sort(empData,new EmpSalaryComparator());
			System.out.println("Sorted  list  as per emp's salary");
			for(Emp e : empData)
				System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
