package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {
		// Display all student details
		List<Student> students = populateList();
	//	students.forEach(student -> System.out.println(student));
		students.forEach(System.out::println);

	}

}
