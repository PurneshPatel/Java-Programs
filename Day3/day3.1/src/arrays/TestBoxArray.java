package arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Box;

/*
 * Objective : Ask user(client) , how many boxes to make ?
Accept Box dims 

Store these details suitably.
1. Display using single for-each loop, box dims n volume
 */
public class TestBoxArray {
	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of boxes");
		//create an array to hold Box type of references
		Box[] boxes;
		boxes=new Box[sc.nextInt()];//5 , how many objs ? 1 : Box[] : cls name : [Lcom.app.core.Box
		System.out.println("def array contents "+Arrays.toString(boxes));
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims : w h d ");
			boxes[i]=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());//10 20 30 , 1 2 3
		}
		//Display using single for-each loop, box dims n volume
		for(Box b : boxes)//b=boxes[0],b=boxes[1]......b=boxes[boxes.length-1]
		{
			System.out.println(b.getBoxDims());
			System.out.println("Volume = "+b.computeVolume());
		}
		System.out.println("Box array "+Arrays.toString(boxes));
		
		sc.close();
	}
}
