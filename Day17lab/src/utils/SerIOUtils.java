package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Book;
import static utils.CollectionUtils.populateBooks;

public interface SerIOUtils {
	static void storeBooks(Map<String, Book> books, String fileName) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(books);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Book> restoreBooks(String fileName) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<String, Book>) in.readObject();
		} catch (Exception e) {
			return populateBooks();
		}
	}
}
