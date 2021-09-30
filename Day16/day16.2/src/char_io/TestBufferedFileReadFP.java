package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufferedFileReadFP {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <-----BR <----- FR (fileName) : chain of i/o streams
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			// read data till EOF (end of stream)
//			String line = null;
//			while ((line = br.readLine()) != null)
//				System.out.println(line);
			br.lines() //Stream<String> : attaching stream to BR (source)
			.forEach(System.out::println); //terminal operation
			System.out.println("file read over....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
