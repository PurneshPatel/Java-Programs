package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.Comparator;
import java.util.List;

import com.app.core.Student;

public class Test6 {

	public static void main(String[] args) {
		// Display all student details
		List<Student> students = populateList();
		System.out.println("Student list");
		students.forEach(System.out::println);
		System.out.println("sorted students as per name");
		students.stream().
		sorted(Comparator.comparing(Student::getName)).
		forEach(System.out::println);

	}

}
