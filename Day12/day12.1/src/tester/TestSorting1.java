package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.app.core.Emp;

public class TestSorting1 {

	public static void main(String[] args) {

		try {
			// get populated emp list.
			ArrayList<Emp> list = populateEmpData();
			System.out.println("original list");
			for(Emp e : list)
				System.out.println(e);//ordered o/p
			Collections.sort(list);
			System.out.println("sorted  list  as per emp id");
			for(Emp e : list)
				System.out.println(e);//sorted o/p
	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
