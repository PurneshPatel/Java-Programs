package generic_methods;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// create an empty fixed size list of integers
		List<Integer> list1 = Arrays.asList();
		System.out.println(list1);
	//	list1.add(100);//UnsupportedOPException : fixed size list
		// create an  fixed size list of integers from the array
		Integer[] data= {10,12,34,1,45,78};
		List<Integer> list2= Arrays.asList(data);
		System.out.println(list2);
	//	list2.remove(0);//UnsupportedOPException : fixed size list
		List<Integer> list3=Arrays.asList(10,2,3,4,6);
		System.out.println(list3);
		list3.set(0,12345);
		System.out.println(list3);
		

	}

}
