package tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Emp;
import com.app.core.Manager;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * public static <T> void sort(List<T> list, Comparator<? super T> comp)
		 */
		//Will you be able to sort Vector<Emp>  details using above method if Emp is NOT Comparable? : YES
		//Can you pass Comparator<Mgr> : NO (legal : Emp or it's super type)
		List<Emp> list=Arrays.asList(new Emp(),new Emp(),new Emp());
//		Collections.sort(list,new Comparator<Manager>() {
//			@Override
//			public int compare(Manager m1,Manager m2)
//			{
//				return 0;
//			}
//		});
		Collections.sort(list,new Comparator<Emp>() {
			@Override
			public int compare(Emp m1,Emp m2)
			{
				return 0;
			}
		});
		

	}

}
