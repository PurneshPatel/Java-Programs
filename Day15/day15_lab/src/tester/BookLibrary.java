package tester;

import static utils.CollectionUtils.populateBooks;

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
			// get lib books
			Map<String, Book> books = populateBooks();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Display all books 2. Issue Out a Book 3. Return book "
						+ "4. Apply discount on old books 5. Sort as per ISBN 6. Sort as per Date n Author 100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // display all books : since Map is not Iterable , Map ---> Collection view
						// keySet / values/entrySet
						System.out.println("Library books");
//						for (Book b : books.values())
//							System.out.println(b);
						books.forEach((isbn, book) -> System.out.println(book));// forEach : higher order function
						break;
					case 2:
						System.out.println("Enter ISBN n quantity to issue out book/s");
						String isbn = sc.next();
						int qty = sc.nextInt();
						// check if book by specific isbn is available
						Book book = books.get(isbn);
						if (book == null)
							throw new BookHandlingException("Book with ISBN " + isbn + " not found !!!!!");
						// book is available , now check qty
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
						// since searching by value based criteria : convert it to collection view n
						// then filter n update
//						for(Book b : books.values())
//							if(b.getPublishDate().isBefore(date))
//								b.setPrice(b.getPrice()-discount);
						books.forEach((isbn1, bk) -> {
							if (bk.getPublishDate().isBefore(date))
								bk.setPrice(bk.getPrice() - discount);
						});
						System.out.println("Applied discount....");
						break;

					case 5:
						// TreeMap can mamange the srting since it's based upon key based criteria
						// (ISBN)
						TreeMap<String, Book> sortedBooks = new TreeMap<>(books);
						// JVM invokes String's compareTo
						// display sorted books : forEach (lambda expression)
						sortedBooks.forEach((isbn1, book1) -> System.out.println(book1));
						break;

					case 6:// sort as per publish date n author
						// since sorting criteria is value based : can't be done with TreeMap
						// convert Map ---> Collection ---> ArrayList
						ArrayList<Book> list = new ArrayList<>(books.values());
//						Collections.sort(list, new Comparator<Book>() {
//
//							@Override
//							public int compare(Book o1, Book o2) {
//								int ret=o1.getPublishDate().compareTo(o2.getPublishDate());
//								if(ret == 0) //publish date  same
//									return o1.getAuthor().compareTo(o2.getAuthor());
//								return ret;
//							}
//							
//						});
						// function literal
						Comparator<Book> bookComparator = (o1, o2) -> {
							int ret = o1.getPublishDate().compareTo(o2.getPublishDate());
							if (ret == 0) // publish date same
								return o1.getAuthor().compareTo(o2.getAuthor());
							return ret;
						};

						Collections.sort(list, bookComparator);
						// sorted list
						System.out.println("Sorted books as per date n author");
						list.forEach(b -> System.out.println(b));

						break;

					case 100:
						exit = true;
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
