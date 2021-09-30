package tester;

import static utils.CollectionUtils.populateData;

import java.util.List;

import com.app.core.Category;
import com.app.core.Product;

public class Test3 {

	public static void main(String[] args) {
		List<Product> products = populateData();
		// display all product details : lambda expr
		products.forEach(p -> System.out.println(p));

		// remove all products of category "Fruit"
		// Method of Collection i/f
		// public boolean removeIf(Predicate<? super T> filter)
		// SAM : public boolean test(T o)
		products.removeIf(product -> product.getProductCatgeory().equals(Category.FRUITS));

		// display all product details again: lambda expr
		System.out.println("After removing fruits");
		products.forEach(p -> System.out.println(p));

	}

}
