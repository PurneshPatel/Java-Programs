package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test5 {

	public static void main(String[] args) {
		Person ref = new Student("Rama", "Singh", 2020, "eDAC", 12345, 78);// indirect ref : up casting ---> student
		System.out.println(ref);// JVM will invoke toString : Student : Dynamic method dispatch(run time poly.)

//		ref=new Faculty("Amit", "Kulkarni", 10, "java .net REST");//Faculty IS-A Object : YES : up casting
//		System.out.println(ref);

		((Student) ref).study();// javac chks by type of ref : why explicit type casting is required ?
		// down casting : IS NOT implicit conversion

		ref = new Faculty("Amit", "Kulkarni", 10, "java .net REST");// Faculty IS-A Object : YES : up casting
		System.out.println(ref);//print faculty's details
		
		((Faculty)ref).teach();//javac chks : if teach() exists in Facutly : YES  --- no javac err

	}

}
