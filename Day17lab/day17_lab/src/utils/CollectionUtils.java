package utils;

import static com.app.core.Category.FICTION;
import static com.app.core.Category.SCIENCE;
import static com.app.core.Category.YOGA;
import static java.time.LocalDate.parse;

import java.util.HashMap;
import java.util.Map;

import com.app.core.Book;

public interface CollectionUtils {
//add static method to populate map of books
	static Map<String,Book> populateBooks()
	{
		Map<String,Book> map=new HashMap<>();
		//String isbn, String author, double price, Category category, int quantity, LocalDate publishDate)
		map.put("book1", new Book("book1", "Ramesh",500 ,SCIENCE, 50,parse("1999-01-01")));
		map.put("book6", new Book("book6", "Gauri",400 ,FICTION, 20,parse("2001-01-01")));
		map.put("book2", new Book("book2", "Ramesh",700 ,SCIENCE, 55,parse("1999-11-21")));
		map.put("book3", new Book("book3", "Kiran",450 ,YOGA, 40,parse("1998-05-21")));
		map.put("book7", new Book("book7", "Mihir",550 ,SCIENCE, 50,parse("1999-01-01")));
		map.put("book8", new Book("book8", "Ramesh",510 ,SCIENCE, 30,parse("2020-01-01")));
		return map;
	}
}
