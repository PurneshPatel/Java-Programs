package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;

public class TestDisplayAll {
	public static void main(String[] args) {
		List<Student> students = populateList();
			students.forEach(System.out::println);
	}			
}
