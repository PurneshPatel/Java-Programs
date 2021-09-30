package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test2 {

	public static void main(String[] args) {
		
		Object ref= new Student("Rama", "Singh", 2020, "eDAC", 12345, 78);//indirect ref : up casting ---> student
		System.out.println(ref);//JVM will invoke toString : Student  : Dynamic method dispatch
		
	//	p=new Faculty("Amit", "Kulkarni", 10, "java .net REST");//up casting p----> faculty object
	//	System.out.println(p);//JVM will invoke :toString : Faculty 's object
		
		ref=new Faculty("Amit", "Kulkarni", 10, "java .net REST");//Faculty IS-A Object : YES : up casting
		System.out.println(ref);
		

	}

}
