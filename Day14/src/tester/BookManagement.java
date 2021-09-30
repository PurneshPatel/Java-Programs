package tester;

import static utils.CollectionUtils.populateMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.app.core.Category;
import com.app.core.Book;
import custom_exception.BookHandlingException;

import static com.app.core.Category.valueOf;


public class BookManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable D.S
			HashMap<Integer, Book> bookMap = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options : 0.Display all available books using Iterator 1.Issue out book 2.Return book 3.Apply discount on old books 4.Sort the books as per isbn 100. Exit");
				try {
					switch (sc.nextInt()) {
					case 0:
						System.out.println("Book Details");
						for (Book b : bookMap.values())
							System.out.println(b);
						break;
					case 1:		
						System.out.println("Enter book isbn and quantity");
						int isbn = sc.nextInt();
						int quantity = sc.nextInt();
						Book index = bookMap.get(sc.nextInt());
						index=bookMap.remove(sc.nextInt());
						if (index == null)
							throw new BookHandlingException("Invalid book id : book not found!!!!!");
						Book book1 = bookMap.get(index);
						book1.setQuantity(book1.getQuantity() - quantity);
						System.out.println("Book details after issuing " + index);
						break;
					case 2:
						System.out.println("Enter book isbn and quantity");
						isbn = sc.nextInt();
						quantity = sc.nextInt();
						
						index = bookMap.get(sc.nextInt());
						if (index == null)
							throw new BookHandlingException("Invalid book id : book not found!!!!!");
						Book book2 = bookMap.get(index);
						book2.setQuantity(book1.getQuantity() + quantity);
						
						System.out.println("Book details after return " + index);
						break;
					case 3:
						System.out.println("Enter Publish date and Discount ");
						LocalDate publish_date = parse(sc.next());
						int Discount = sc.nextInt();
						for (Book b1 : books)
							if (b1.getPublish_date().after(publish_date))
								b1.setPrice(b.getPrice() - Discount);
						System.out.println("salary updated");
						for (Book b1 : books1)
							System.out.println(b1);
						break;
					case 4:
						TreeMap<Integer, Book> sortedMap = new TreeMap<>(bookMap);
						System.out.println("Books sorted as per isbn ");
						for (Book b2 : sortedMap.values())
							System.out.println(b2);
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
