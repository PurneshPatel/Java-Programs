package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test1 {

	public static void main(String[] args) {
		// super cls ref , super cls obj , sub cls ref , sub cls obj
		// sub cls ref ------> sub class obj (direct referencing) : type of the ref n
		// type of the obj is SAME
		Student s1 = new Student("Rama", "Singh", 2020, "eDAC", 12345, 78);
		/*
		 * Javac resolves the method binding by the type of the reference & JVM resolves
		 * the method binding by type of the object it's referring to.
		 */
		System.out.println(s1);//javac chks if toString exists in Student class : YES compiles ok
		//JVM : late binding ---> toString --> will be called on student's object.
		Person p;//p : super cls ref
		p=s1;//up casting Student---->Person : done implicitly by javac
		System.out.println(p);//javac chks if toString exists in Person class, in run time (JVM) :
		//JVM will invoke toString : of student : i.e will pick @ run time : overriding form of the method
		
		p=new Faculty("Amit", "Kulkarni", 10, "java .net REST");//up casting p----> faculty object
		System.out.println(p);//JVM will invoke :toString : Faculty 's object
		

	}

}
