package tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// Method of Collection i/f
		// public boolean removeIf(Predicate<? super T> filter)
		// SAM : public boolean test(T o)
		ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
		list.forEach(s -> System.out.print(s + " "));
		// remove all strings starting with letter 't'
//		list.removeIf(s -> {
//			if (s.startsWith("t"))
//				return true;
//			return false;
//		});
		System.out.println("removed any elems ?"+list.removeIf(s -> s.startsWith("z")));
		System.out.println("After remove");
		list.forEach(s -> System.out.print(s + " "));

	}

}
