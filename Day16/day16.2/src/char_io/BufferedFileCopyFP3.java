package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopyFP3 {

	public static void main(String[] args) {
		System.out.println("Enter src n dest file names on separate lines");
		try(Scanner sc=new Scanner(System.in);
				//Java App <-----BR <----FR(src file name)
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//Java App ---> PW ---> FW (dest file)
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))
				)
		{
			br.lines(). //Stream<String> : all line :from src
			filter(s -> s.length() > 40). //Stream<String> : lines length > 40 : intermediate op
			mapToInt(String::length).	//	IntStream : contains stream of ints(primitive) : intermediate op
			 forEach(pw::println); //terminal op.
			 
			System.out.println("copy done!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
