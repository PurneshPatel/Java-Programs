package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test6 {

	public static void main(String[] args) {
		Person ref = new Student("Rama", "Singh", 2020, "eDAC", 12345, 78);// indirect ref : up casting ---> student
		
		((Student) ref).study();// javac chks by type of ref : why explicit type casting is required ?
		// down casting : IS NOT implicit conversion

		ref = new Faculty("Amit", "Kulkarni", 10, "java .net REST");// Faculty IS-A Object : YES : up casting
		((Student) ref).study();//JVM throws : ClassCastException (Faculty ----X----> Student
		System.out.println("main over...");
		
		

	}

}
