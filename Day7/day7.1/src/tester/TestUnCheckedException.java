package tester;

import java.util.Scanner;

public class TestUnCheckedException {

	public static void main(String[] args) {
		try {
			int[] data = { 1, 2, 3, 4, 5, 6 };
			// javac DOES NOT force handling of the un checked excs(extending from
			// java.lang.RunTimeException)
			System.out.println(data[0]);//6
			String s="12345a";
			System.out.println("Parsed integer "+Integer.parseInt(s));//NFE
			Scanner sc=null;
			System.out.println(sc.nextInt());//NPE
			System.out.println("end of try....");
	} 
//			catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("error1");
//		}
//		catch (NumberFormatException e)
//		{
//			System.out.println("error2");
//		}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println("in multi-catch "+e);//e.toString()
		}
		catch (Exception e) {
		//	System.out.println("in catch-all");
			e.printStackTrace();
		}
		System.out.println("main cntd....");

	}

}
