package sets;

import java.util.HashSet;

import com.app.core.Student;

public class StudentSet {

	public static void main(String[] args) {
		// create empty HashSet to store student type of refs
		HashSet<Student> students = new HashSet<>();
		Student s1 = new Student(100, "Rama", "Pune");
		Student s2 = new Student(100, "Rama", "Pune");
		//PK of student : roll number

		// populate the same .
		System.out.println("Added " + students.add(s1));//true
		System.out.println("Added " + students.add(s2));//dup will NOT be detected : true
		// observe n conclude.
		for (Student s : students)
			System.out.println(s);//dups !!!!
		System.out.println("Size "+students.size());//2
		//CONTRACT : equal objs MUST produce SAME hash code values
		System.out.println("eq : "+s1.equals(s2));//true
		System.out.println("hashCodes "+s1.hashCode()+"    "+s2.hashCode());//different hash codes

	}

}
