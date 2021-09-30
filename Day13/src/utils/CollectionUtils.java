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
		list.add(new Book(5001, "Manjula Padmanabhan",100, SCI_FI,6,sdf.parse("07-11-2008")));
		list.add(new Book(8545, "RUSKIN BOND",250,CONTEMPORARY,3,sdf.parse("10-02-2014")));
		list.add(new Book(4589, "S.C.Jain",350, TECHNOLOGY,4,sdf.parse("15-12-2011")));
		list.add(new Book(6154, "Arundhati Roy",150, STORY,5,sdf.parse("15-03-2010")));
		list.add(new Book(3846, "R.K.Narayan",450, NOVEL,6,sdf.parse("11-05-2020")));
		list.add(new Book(7586, "Nazir shah",280, STORY,10,sdf.parse("10-04-2009")));
		list.add(new Book(2524, "R.K.Narayan",450, TECHNOLOGY,8,sdf.parse("07-08-2015")));
		return list;
	}
}
