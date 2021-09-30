package arrays;

import java.util.Arrays;
/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop
 */
import java.util.Scanner;

public class TestPrimitiveArray {

	public static void main(String[] args) {
		// Create a scanner wrapping stdin
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		double[] data;// data : ref type : array type (holding double vals) : 4/8/16 bytes will be mem
						// allocated on stack
	//	System.out.println(data);
		data = new double[sc.nextInt()];// [D class will be loaded in method area
		// display array data : def values
		System.out.println("Def contents of the array via for loop");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();
		System.out.println("Def contents of the array via for-each");
		// To access array elems : for-each
		for (double d : data)// d=data[0],d=data[1].....d=data[data.length-1]
			System.out.print(d + " ");
		//Accept data from User(scanner) & store it in the array. : for loop
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter double number");
			data[i]=sc.nextDouble();
		}
		System.out.println("Inited contents of the array via for-each");
		// To access array elems : for-each
		for (double d : data)// d=data[0],d=data[1].....d=data[data.length-1]
			System.out.print(d + " ");
		//how to display array contents directly , Using java.util.Arrays : toString
		//API public static String toString(double[] arr)
		System.out.println("Array contents "+Arrays.toString(data));
		//How to display the name of the class for an array object ?
		System.out.println("ClassName for Array "+data.getClass().getName());//[D
		byte[][] bytes=new byte[4][5];
		System.out.println("ClassName for Array "+bytes.getClass().getName());//[[B
		

		sc.close();

	}

}
