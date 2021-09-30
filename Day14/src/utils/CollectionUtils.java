package utils;

import java.util.HashMap;

import static com.app.core.Category.*;
import static java.time.LocalDate.parse;


import com.app.core.Book;

public class CollectionUtils {	
	public static HashMap<Integer, Book> populateMap()
	{
		HashMap<Integer, Book > books=new HashMap<>();
		System.out.println(books.put(5001, new Book(5001, "Manjula Padmanabhan",100, SCI_FI,6,parse("2008-11-07"))));
		System.out.println(books.put(8545, new Book(8545, "RUSKIN BOND",250,CONTEMPORARY,3,parse("2004-02-10"))));
		System.out.println(books.put(4589, new Book(4589, "S.C.Jain",350, TECHNOLOGY,4,parse("2011-02-15"))));
		System.out.println(books.put(6154, new Book(6154, "Arundhati Roy",150, STORY,5,parse("2010-03-15"))));
		System.out.println(books.put(3846, new Book(3846, "R.K.Narayan",450, NOVEL,6,parse("2020-05-11"))));
		System.out.println(books.put(7586, new Book(7586, "Nazir shah",280, NOVEL,10,parse("2009-04-10"))));
		System.out.println(books.put(2524, new Book(2524, "R.K.Narayan",450, NOVEL,8,parse("2015-08-07"))));
		
		System.out.println(books);
		System.out.println(books.size());
		return books;
	}
}
