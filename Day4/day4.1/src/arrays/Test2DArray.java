package arrays;

import java.util.Arrays;

public class Test2DArray {

	public static void main(String[] args) {
		double[][] data = new double[3][4];//how many objs : 4
		int value = 1;
		for (int i = 0; i < data.length; i++)//i =0,1
			for (int j = 0; j < data[i].length; j++)//data[0].length=4
				data[i][j] = value++;//data[0][0]=1,....

		// display the array contents using for loop
		System.out.println("Dsiplay array data with for loop");
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				System.out.print(data[i][j]+" ");
		System.out.println("Dsiplay array data with Arrays : deepToString");
		System.out.println(Arrays.deepToString(data));
		//System.out.println(this);

	}

}
