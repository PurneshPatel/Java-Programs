package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Product;

import static utils.CollectionUtils.*;
import static utils.SerIOUtils.writeDetails;

public class StoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			// get sample data from collection utils
			Map<Integer, Product> products = populateMapFromList(populateData());
			//invoke SerIOUtils method to store the details
			writeDetails(products,sc.nextLine());
			System.out.println("data stored ....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
