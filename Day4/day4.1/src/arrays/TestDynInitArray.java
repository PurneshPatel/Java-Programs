package arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Box;

public class TestDynInitArray {

	public static void main(String[] args) {
		// array of primitive types
		int[] data = { 10, 1, 23, 45, 56, 678, 44 };// dynamic init of array : loads [I class , create array obj n inits
													// the array with actual values
		System.out.println("Array contents " + Arrays.toString(data));
		System.out.println("Name of the loaded class in method area " + data.getClass().getName());
		Scanner sc = new Scanner(System.in);
		System.out.println("loaded cls for scanner " + sc.getClass().getName());// java.util.Scanner
		sc.close();
		// dyn init of array of refs : sample data
		Box[] boxes = { new Box(1, 2, 3), new Box(4, 5, 6), new Box(7, 8, 9) };// 1 (array: holder of refs) + 2 box type
																				// of objects

	}

}
