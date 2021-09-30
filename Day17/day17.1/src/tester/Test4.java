package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

public class Test4 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		// Display all student details
		List<Student> students = populateList();
		System.out.println("Students : ");
		students.forEach(System.out::println);
		System.out.println("Enter subject");
		Subject subject=Subject.valueOf(sc.next().toUpperCase());
		double sumOfGPA=students.stream().
		filter(s -> s.getSubject()==subject).
		mapToDouble(Student :: getGpa).
		sum();
		System.out.println(sumOfGPA);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
