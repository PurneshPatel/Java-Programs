package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IOUtils {
//add a static method to store sorted student details into a text file (using buffer)
	static void writeData(Stream<Student> students,String fileName) throws IOException
	{
		System.out.println("writeData invoked by "+Thread.currentThread().getName());
		//Java App ---> PW ---> FW (text file)
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			students.forEach(pw::println);//s->pw.println(s)
		}
	}
}
