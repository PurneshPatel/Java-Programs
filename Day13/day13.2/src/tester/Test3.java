package tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		//Method of Collections class : public static void shuffle​(List<?> list)
		//Use above method to shuffle AL/LL/Vector of strings
		List<String> list=Arrays.asList("one","two","three","four","five");
		Collections.shuffle(list);
		System.out.println(list);
		//can you use above method to shuffle LinkedList<Integer> : 
		LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
		list2.add(0,99);
		System.out.println(list2);
		//shuffle
		Collections.shuffle(list2);
		System.out.println(list2);
	}

}
