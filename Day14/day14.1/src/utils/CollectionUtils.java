package utils;

import static com.app.core.Category.*;
import static com.app.core.Book.sdf;
import java.text.ParseException;
import java.util.ArrayList;
import com.app.core.Book;

public class CollectionUtils {	
	public static ArrayList<Book> populateBookDetails() throws ParseException
	{
		ArrayList<Book> list=new ArrayList<>();
		list.add(new Book(1001, "Manjula Padmanabhan",10000, SCI_FI,2,sdf.parse("07-11-2008")));
		list.add(new Book(1002, "RUSKIN BOND",500000,CONTEMPORARY,3,sdf.parse("10-02-2014")));
		list.add(new Book(1003, "S.C.Jain",35000, TECHNOLOGY,4,sdf.parse("15-12-2011")));
		list.add(new Book(1004, "Arundhati Roy",150, STORY,5,sdf.parse("15-03-2010")));
		list.add(new Book(1005, "R.K.Narayan",450, NOVEL,6,sdf.parse("11-05-2020")));		
		return list;
	}
}
