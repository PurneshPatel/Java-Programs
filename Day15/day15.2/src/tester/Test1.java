package tester;
import static utils.CollectionUtils.populateData;

import java.util.List;

import com.app.core.Product;

public class Test1 {

	public static void main(String[] args) {
		List<Product> products = populateData();
		//display all product details : lambda expr
		products.forEach(p -> System.out.println(p));
		
		//apply discount (reduce prices of all products by 50) : lambda expr
		products.forEach(product -> product.setPrice(product.getPrice()-50));
		
		
		//display all product details again: lambda expr
		System.out.println("After applying discount...");
		products.forEach(p -> System.out.println(p));

	}

}
