package tester;
//static import syntax : F.Q class Name.validateSpeed
import static utils.ValidationRules.validateSpeed;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter current speed");
	//		ValidationRules.validateSpeed(sc.nextInt());
			validateSpeed(sc.nextInt());
			System.out.println("end of try");
		}catch (Exception e) {
		//	e.printStackTrace();
		//	System.out.println(e);//e.toString()
			System.out.println(e.getMessage());
		}
		System.out.println("main over...");

	}

}
