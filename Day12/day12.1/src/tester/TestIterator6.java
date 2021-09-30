package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.app.core.Emp;

public class TestIterator6 {

	public static void main(String[] args) {

		try {
			// get populated emp list.
			ArrayList<Emp> list = populateEmpData();
			//display emp details in reverse order
			//attach ListIterator after the last elem
			ListIterator<Emp> litr=list.listIterator(list.size());
			while(litr.hasPrevious())
				System.out.println(litr.previous());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
