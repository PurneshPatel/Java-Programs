package lists;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		// create empty list to hold Integer type of refs
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list.size());//0
		System.out.println(list.isEmpty());//true
		//populate AL with the array data
		int[] data= {10,1,23,45,11,-100,10,23,45,10};
		//ArrayList : add
		for(int i : data)//NONE i=data[0]....
			list.add(i);//int ---> Integer(auto boxing)
		//can you attach a for-each to AL ? YES (since AL IS-A Iterable)
		for(int i : list) //Integer --> int
			System.out.print(i+" ");
		//contains : searching
		System.out.println(list.contains(1123)?"Found":"Not Found");
		System.out.println(list.indexOf(10)+" "+list.lastIndexOf(10));

	}

}
