package tester;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.List;

import com.app.core.Product;

public class Test5 {

	public static void main(String[] args) {
		List<Product> products = populateData();
		//display all product details : lambda expr
		System.out.println("Original product list");
		products.forEach(p -> System.out.println(p));
		//sort products as per price
		//Comparator : func i/f 
		//SAM : public int compare(T o1,T o2)
		Collections.sort(products,(product1,product2)->((Double)product1.getPrice()).compareTo(product2.getPrice()));
		System.out.println("Sorted  product list");
		products.forEach(p -> System.out.println(p));

	}

}
