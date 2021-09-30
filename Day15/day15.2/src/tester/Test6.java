package tester;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test6 {

	public static void main(String[] args) {
		final int data=12345;//int constant / literal
		String s="hello";//s : literal
		
		List<Product> products = populateData();
		//display all product details : lambda expr
		System.out.println("Original product list");
		products.forEach(p -> System.out.println(p));
		//sort products as per price
		//Comparator : func i/f 
		//SAM : public int compare(T o1,T o2)
		//function literal
		Comparator<Product> comp=(product1,product2)->((Double)product1.getPrice()).compareTo(product2.getPrice());
		Collections.sort(products,comp);
		System.out.println("Sorted  product list");
		products.forEach(p -> System.out.println(p));

	}

}
