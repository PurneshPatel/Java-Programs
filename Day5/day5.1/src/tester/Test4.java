package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test4 {

	public static void main(String[] args) {
		Object[] people = { new Student("Rama", "Singh", 2020, "eDAC", 12345, 78),
				new Faculty("Amit", "Kulkarni", 10, "java .net REST") };//3 objs excluding strings 
		//1 array of refs , student obj created outside n it's ref added in the 0th index of the array
		//faculty obj created outside n it's ref added in the 1st index of the array
		//people[0] : person ---> student obj , people[1] ---> faculty
		for (Object p : people) //p=people[0],p=people[1]
			System.out.println(p);

	}

}
