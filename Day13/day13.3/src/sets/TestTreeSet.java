package sets;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> intSet = new TreeSet<>();// empty Set
		int[] data = { 23, 1, 234, 45, -10, 1, 23, 1, 56, 78 };// int[]
		// populate the set from array
		for (int i : data)// no impl conversion i=data[0]......
			System.out.println("Added " + intSet.add(i));// javac impl auto boxing (int--> Integer)
		System.out.println(intSet);// no dups! , sorted as per natural ordering criteria, un ordered
		// During the population of this TreeSet , JVM will invoke which class's :
		// Integer , which method for sorting " compareTo?

	}

}
