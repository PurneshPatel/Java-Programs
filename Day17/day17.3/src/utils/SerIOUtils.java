package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Product;

public interface SerIOUtils {
//add a static method to persist  map of products into bin file : using serialization
	static void writeDetails(Map<Integer,Product> products,String fileName) throws IOException
	{
		//Java App ---> OOS ---> FOS (bin file)
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(products);//JVM checks for the serilalizability of the ENTIRE object graph
			//HashMap --Integer ---Product --IS NOT Serializable --
			//Any time JVM comes across non-ser object(eg : Product) : aborts the ser ---> throws 
			//java.io.NotSerializablExc
		}
	}
	//add static method to restore map of products from bin file : use de-serial.
	@SuppressWarnings("unchecked")
	static Map<Integer,Product> readDetails(String fileName) throws IOException,ClassNotFoundException
	{
		//Java App <----- OIS <----FIS(bin file)
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (Map<Integer,Product>)in.readObject();
		}
	}
}
