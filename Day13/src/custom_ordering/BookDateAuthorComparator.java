package custom_ordering;

import java.util.Comparator;

import com.app.core.Book;

public class BookDateAuthorComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		System.out.println("in compare :date n sal");
		// compare by date
		int retValue = o1.getPublish_date().compareTo(o2.getPublish_date());
		if (retValue == 0) {
			return ((String) o1.getAuthor()).compareTo(o2.getAuthor());

		}
		return retValue;
	}

}
