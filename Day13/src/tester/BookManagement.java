package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Book;
import custom_exception.BookHandlingException;
import custom_ordering.BookDateAuthorComparator;

import static com.app.core.Book.sdf;
import static com.app.core.Category.valueOf;
import static utils.CollectionUtils.populateBookDetails;

public class BookManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable D.S
			ArrayList<Book> books = populateBookDetails();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options : 0.Display all available books using Iterator 1.Issue out book 2.Return book 3.Apply discount on old books 4.Sort the books as per isbn 5.Sort the books as per publish date & author 100. Exit");
				try {
					switch (sc.nextInt()) {
					case 0:
						System.out.println("Book Details");
						for (Book e : books)
							System.out.println(e);
						break;
					case 1:
						System.out.println("Enter book isbn and quantity");
						int isbn = sc.nextInt();
						int quantity = sc.nextInt();
						int index = books.indexOf(new Book(isbn));
						if (index == -1)
							throw new BookHandlingException("Invalid book id : book not found!!!!!");
						Book book = books.get(index);
						book.setQuantity(book.getQuantity() - quantity);
						System.out.println("Book details after issue " + books.remove(index));
						break;
					case 2:
						System.out.println("Enter book isbn and quantity");
						isbn = sc.nextInt();
						quantity = sc.nextInt();

						index = books.indexOf(new Book(isbn));
						if (index == -1)
							throw new BookHandlingException("Invalid book id : book not found!!!!!");
						Book book1 = books.get(index);
						book1.setQuantity(book1.getQuantity() + quantity);

						System.out.println("Book details after returm " + books.remove(index));
						break;
					case 3:
						System.out.println("Enter Publish date and Discount ");
						Date publish_date = sdf.parse(sc.next());
						int Discount = sc.nextInt();
						
						for (Book b : books)
							if (b.getPublish_date().after(publish_date))
								b.setPrice(b.getPrice() - Discount);
						
						System.out.println("Discount applied on book");
						break;
					case 4:
						for (Book b : books)
							System.out.println(b);
						Collections.sort(books);
						System.out.println("sorted  list  as per book isbn");
						for (Book b : books)
							System.out.println(b);
						break;
					case 5:
						for (Book e : books)
							System.out.println(e);
						
						Collections.sort(books, new Comparator<Book>() {
							public int compare(Book o1, Book o2) {
								System.out.println("in compare ano inner :date n author");
								
								int retValue = o1.getPublish_date().compareTo(o2.getPublish_date());
								if (retValue == 0) {
									
									return ((String) o1.getAuthor()).compareTo(o2.getAuthor());
								}
								return retValue;
							}
						});
						System.out.println("Sorted  list  as per book's date and author");
						for (Book e : books)
							System.out.println(e);
						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
