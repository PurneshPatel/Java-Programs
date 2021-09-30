package tester;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter full name");
			System.out.println("Hello , "+sc.nextLine());
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
