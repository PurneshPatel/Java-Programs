package tester;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test2 {

	public static void main(String[] args) {
		//get populated list of products
		List<Product> list = populateData();
		//display products using meth ref.
		System.out.println("Original list");
		list.forEach(System.out::println);
		//sort the list as per it's price
		//Comaprator's method : comparing : 
		list.sort(Comparator.comparing(p->p.getPrice()));
		System.out.println("Sorted list as per price");
		list.forEach(System.out::println);
		

	}

}
