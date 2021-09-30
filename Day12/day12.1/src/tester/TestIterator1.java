package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Emp;

public class TestIterator1 {

	public static void main(String[] args) {

		try {
			// get populated emp list.
			ArrayList<Emp> list = populateEmpData();
			System.out.println(list.size());// 5
			// Display emp details using iterator
			Iterator<Emp> itr = list.iterator();
			while (itr.hasNext())
				System.out.println(itr.next());
			System.out.println("end of list....");
	//		System.out.println(itr.next());NoSuchElementException

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
