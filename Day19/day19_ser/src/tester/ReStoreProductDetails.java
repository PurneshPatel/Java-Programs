package tester;

import static utils.SerIOUtils.readDetails;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Product;

public class ReStoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			
			//invoke SerIOUtils method to re store the product details from bin file
			Map<Integer, Product> map = readDetails(sc.nextLine());
			System.out.println("Display product details");
			map.forEach((k,v) -> System.out.println(v));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
