package tester;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test1 {

	public static void main(String[] args) {
		//get populated list of products
		List<Product> list = populateData();
		//display products using meth ref.
		System.out.println("Original list");
		list.forEach(System.out::println);
		//sort the list as per it's manufactureDate
		Comparator<Product> comp=(p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate());
	//	Collections.sort(list, comp);
		list.sort(comp);
		System.out.println("Sorted  list");
		list.forEach(System.out::println);
		

	}

}
