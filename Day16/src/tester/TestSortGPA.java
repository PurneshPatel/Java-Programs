package tester;
import static utils.CollectionUtils.populateList;
import java.util.Comparator;
import java.util.List;
import com.app.core.Student;

public class TestSortGPA {
	public static void main(String[] args) {
		List<Student> students = populateList();
		students.stream().sorted(Comparator.comparing(Student::getGpa)). 
		forEach(System.out::println);
	}
}
