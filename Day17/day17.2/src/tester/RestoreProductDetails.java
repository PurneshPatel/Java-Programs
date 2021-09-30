package tester;

import java.util.Scanner;

import com.app.core.Product;

import static utils.IOUtils.readProductDetails;

public class RestoreProductDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name , to restore product details");
			Product product = readProductDetails(sc.nextLine());
			System.out.println("Restored details from bin file "+product);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
