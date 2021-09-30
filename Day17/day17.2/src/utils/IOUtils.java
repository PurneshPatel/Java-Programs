package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.core.Category;
import com.app.core.Product;

public interface IOUtils {
//add static method to store product details in a bin file
	static void writeProductDetails(Product product, String fileName) throws IOException {
		// chain of I/O streams
		// Java App ---> DOS ---> BOS ----> FOS(Bin File)
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			// Product : int id, String name, Category productCatgeory, LocalDate
			// manufactureDate, double price
			out.writeInt(product.getId());// id
			out.writeUTF(product.getName());// name ---> bytes --> buffer
			out.writeUTF(product.getProductCatgeory().toString());// catgeory
			out.writeUTF(product.getManufactureDate().toString());// manufacture date
			out.writeDouble(product.getPrice());// price

		} // out.close()
	}
	// add static method to re - store product details from a bin file
	static Product readProductDetails(String fileName) throws IOException {
		// chain of I/O streams
		// Java App <--- DIS <--- BIS <---- FIS(Bin File)
		try (DataInputStream in = 
				new DataInputStream(new BufferedInputStream
						(new FileInputStream(fileName)))) {
			// Product : int id, String name, Category productCatgeory, LocalDate
						// manufactureDate, double price
			return new Product(in.readInt(),in.readUTF(),
					Category.valueOf(in.readUTF()),LocalDate.parse(in.readUTF()),in.readDouble());
		}
		

	}
}
