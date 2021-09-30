package sets;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Integer> intSet=new HashSet<>();//empty Set
		int[] data= {23,1,234,45,-10,1,23,1,56,78};//int[]
		//populate the set from array
		for(int i : data)//no impl conversion i=data[0]......
			System.out.println("Added "+intSet.add(i));//javac impl auto boxing (int--> Integer)
		System.out.println(intSet);//no dups! , un sorted ,  un ordered
		System.out.println(intSet.size());//7
		System.out.println("Contains 234" +intSet.contains(234));//true
		System.out.println("removed 1234" +intSet.remove(1234));//false

	}

}
