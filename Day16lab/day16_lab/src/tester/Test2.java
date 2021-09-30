package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Student;

public class Test2 {

	public static void main(String[] args) {
		// 1.5 Display all student details sorted as per GPA
		List<Student> students = populateList();
//		Comparator<Student> comp=(s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa());
//		Collections.sort(students,comp);
//		students.forEach(System.out::println);
		//OR
//		students.stream(). //Stream<Student> : un sorted
//		sorted(comp). //Stream<Student> : sorted as per gpa
//		forEach(System.out::println);
		students.stream(). //Stream<Student> : un sorted
		sorted(Comparator.comparing(Student::getGpa)). //  s -> s.getGpa() Stream<Student> : sorted as per gpa
		forEach(System.out::println);
	
	

	}

}
