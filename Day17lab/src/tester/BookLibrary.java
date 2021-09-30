package tester;

import static utils.SerIOUtils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Book;

import custom_exception.BookHandlingException;
import static java.time.LocalDate.parse;

public class BookLibrary {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name to restore the books");
			String fileName=sc.nextLine();
			Map<String, Book> books = restoreBooks(fileName);
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Display all books 2. Issue Out a Book 3. Return book "
						+ "4. Apply discount on old books 5. Sort as per ISBN 6. Sort as per Date n Author 100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Library books");
						books.forEach((isbn, book) -> System.out.println(book));
						break;
					case 2:
						System.out.println("Enter ISBN n quantity to issue out book/s");
						String isbn = sc.next();
						int qty = sc.nextInt();
						Book book = books.get(isbn);
						if (book == null)
							throw new BookHandlingException("Book with ISBN " + isbn + " not found !!!!!");
						if (book.getQuantity() > qty) {
							book.setQuantity(book.getQuantity() - qty);
							System.out.println("Book with ISBN " + isbn + " issued....");
						} else
							throw new BookHandlingException("Insufficient Qty for Book with ISBN " + isbn);
						break;
					case 3:
						System.out.println("Enter ISBN n quantity to return a book/s");
						isbn = sc.next();
						qty = sc.nextInt();
						book = books.get(isbn);
						if (book == null)
							throw new BookHandlingException("Book with ISBN " + isbn + " not found !!!!!");
						book.setQuantity(book.getQuantity() + qty);
						System.out.println("Book/s returned successfully!");
						break;
					case 4:
						System.out.println("Enter date n discount amount");
						LocalDate date = parse(sc.next());
						double discount = sc.nextDouble();
						books.forEach((isbn1, bk) -> {
							if (bk.getPublishDate().isBefore(date))
								bk.setPrice(bk.getPrice() - discount);
						});
						System.out.println("Applied discount....");
						break;
					case 5:
						TreeMap<String, Book> sortedBooks = new TreeMap<>(books);
						sortedBooks.forEach((isbn1, book1) -> System.out.println(book1));
						break;
					case 6:
						ArrayList<Book> list = new ArrayList<>(books.values());
						Comparator<Book> bookComparator = (o1, o2) -> {
							int ret = o1.getPublishDate().compareTo(o2.getPublishDate());
							if (ret == 0)
								return o1.getAuthor().compareTo(o2.getAuthor());
							return ret;
						};
						Collections.sort(list, bookComparator);
						break;
					case 100:
						exit = true;
						storeBooks(books,fileName);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}
	}
}
