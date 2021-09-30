package sets;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> intSet=new LinkedHashSet<>();//empty Set
		int[] data= {23,1,234,45,-10,1,23,1,56,78};//int[]
		//populate the set from array
		for(int i : data)//no impl conversion i=data[0]......
			System.out.println("Added "+intSet.add(i));//javac impl auto boxing (int--> Integer)
		System.out.println(intSet);//no dups! , un sorted ,   ordered
		

	}

}
