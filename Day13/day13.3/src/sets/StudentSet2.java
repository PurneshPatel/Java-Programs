package sets;

import java.util.HashSet;

import com.app.core.Student;

public class StudentSet2 {

	public static void main(String[] args) {
		// create empty HashSet to store student type of refs
		HashSet<Student> students = new HashSet<>();
		Student s1 = new Student(100, "Rama", "Pune");
		Student s2 = new Student(10, "Kishor", "Mumbai");
		Student s3 = new Student(56, "Rama", "Pune");
		Student s4 = new Student(100, "Rama", "Satara");
		//PK of student : roll number

		// populate the same .
		System.out.println("Added " + students.add(s1));//t
		System.out.println("Added " + students.add(s2));//t
		System.out.println("Added " + students.add(s3));//t
		System.out.println("Added " + students.add(s4));//f
		// observe n conclude.
		for (Student s : students)
			System.out.println(s);//no dups
		System.out.println("Size "+students.size());//3
	

	}

}
