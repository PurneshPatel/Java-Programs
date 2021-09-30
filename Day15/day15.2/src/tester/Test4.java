package tester;

import static utils.CollectionUtils.*;

import java.util.Map;
import java.util.TreeMap;

import com.app.core.Product;

public class Test4 {

	public static void main(String[] args) {
		// get populated map of products
		Map<Integer, Product> products = populateMapFromList(populateData());
		//w/o converting Map ---> Collection view , display product details along with their ids
		//Map i/f method
		//public default void forEach(BiConsumer<? super K,? super V> consumer)
		//SAM : public void accept(K k,V v)
		products.forEach((pid,product) -> System.out.println(pid+" : "+product) );
		//display only product details , sorted in asc order as per product ids
		TreeMap<Integer, Product> sortedMap=new TreeMap<>(products);
		System.out.println("product sorted as per ids : asc");
		sortedMap.forEach((k,v) -> System.out.println(v));
		

	}

}
