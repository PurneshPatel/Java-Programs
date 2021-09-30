package tester;

import static utils.CollectionUtils.populateData;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

public class SaveFilteredSortedProducts {

	public static void main(String[] args) {
		System.out.println("Enter file name to store product details");
		try (Scanner sc = new Scanner(System.in);
				// Java App ---> PW --> FW(text file)
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()))) {
			// get populated list of products
			System.out.println("All products");
			List<Product> list = populateData();
			list.forEach(System.out::println);
			System.out.println("Enter category");
			Category category = Category.valueOf(sc.next().toUpperCase());
			list.stream(). //src  Stream<Product>
			filter(product -> product.getProductCatgeory().equals(category)).  //Stream<Product> : filtered
			sorted(Comparator.comparing(Product :: getPrice)). //Stream<Product> : filtered n sorted
			forEach(pw::println);//terminal operation

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
