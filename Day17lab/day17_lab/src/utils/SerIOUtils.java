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
	//add a static method to store library books using serialization
	
	//method : public void writeObject(Object o) throws IOExc.
	static void storeBooks(Map<String,Book> books,String fileName) throws IOException
	{
		//Java App ---> OOS ---> FOS(bin file)
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(books);
		}
	}
	//add a static method to restore books : from bin file
	//in case of any exc --return map populated with sample data
	//in case of no err --return map populated with data from bin file.
	
	//method : public Object readObject() throws IOExc,ClassNotFoundException
	@SuppressWarnings("unchecked")
	static Map<String,Book> restoreBooks(String fileName)
	{
		//chain : Java App <------OIS <---- FIS(bin file)
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (Map<String,Book>) in.readObject();
		}catch (Exception e) {
			//de -serial failed : so ret sample data map
			return populateBooks();
			
		}
	}
	

}
