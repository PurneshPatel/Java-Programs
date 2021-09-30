package tester;

import java.util.Scanner;

import com.app.core.Product;

import static com.app.core.Category.FRUITS;
import static java.time.LocalDate.parse;
import static utils.IOUtils.writeProductDetails;

public class StoreProductDetails {
	public static void main(String[] args) {
		//store single product details in a bin file
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name to store product details");
			Product p=new Product(100, "mango", FRUITS, parse("2019-01-01"), 500);
			writeProductDetails(p, sc.nextLine());
			System.out.println("product details stored....");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
