package tester;

import static utils.CollectionUtils.populateEmpData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Emp;

public class TestIterator5 {

	public static void main(String[] args) {

		try {
			// get populated emp list.
			ArrayList<Emp> list = populateEmpData();
			System.out.println(list.size());// 5
			// Display emp details using iterator
			Iterator<Emp> itr = list.iterator();
			while (itr.hasNext()) {
		//		itr.next();
				itr.remove();//Illegal state exc : next() must be called before remove()
			}
			System.out.println(list);//emtry list []

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
