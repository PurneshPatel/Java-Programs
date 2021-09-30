package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;

public class TestAvgOfGPA {
	public static void main(String[] args) {
		List<Student> students = populateList();
		students.stream().
		mapToDouble(s -> s.getGpa()).average();
		students.forEach(System.out::println);
	}
}
