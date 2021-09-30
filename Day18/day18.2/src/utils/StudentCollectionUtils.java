package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.core.Student;

import static java.time.LocalDate.parse;
import static com.app.core.Subject.*;

public interface StudentCollectionUtils {
//add a static method to populate student list
	static List<Student> populateList() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("dac-001", "Rama", parse("1999-01-01"), ANGULAR, 8.1));
		students.add(new Student("dac-009", "Tara", parse("1999-11-01"), JAVA, 7.1));
		students.add(new Student("dac-002", "Mihir", parse("1998-01-11"), REACT, 7.5));
		students.add(new Student("dac-005", "Rekha", parse("1997-11-06"), JAVA, 8.6));
		students.add(new Student("dac-003", "Anish", parse("1999-01-21"), SE, 9.1));
		students.add(new Student("dac-004", "Kirti", parse("2000-01-01"), DEVOPS, 6.1));
		students.add(new Student("dac-008", "Anshuman", parse("1998-06-07"), JAVA, 5.1));
		students.add(new Student("dac-006", "Timir", parse("1999-12-21"), DBT, 5.2));
		students.add(new Student("dac-007", "Tarun", parse("1997-03-21"), ANGULAR, 4.8));
		students.add(new Student("dac-010", "Priti", parse("1999-01-08"), JAVA, 8.3));
		return students;
	}
	static Map<String,Student> populateMap(List<Student> list)
	{
		//imperative style 
//		Map<String,Student> map =new HashMap<>();
//		for(Student s : list)
//			map.put(s.getRollNo(), s);
//		return map;
//		return list.stream().//Stream<Student>
//		collect(Collectors.toMap(s->s.getRollNo(), s->s));//keyMapper , valMapper 
		return list.stream().//Stream<Student>
			collect(Collectors.toMap(Student::getRollNo,Function.identity()));//keyMapper , valMapper 
		
	}
	
}
