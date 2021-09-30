package tester;

import inheritance.Faculty;
import inheritance.Student;

public class TestInheritance2 {

	public static void main(String[] args) {
		// create student object
		Student s1 = new Student("Rama", "Singh", 2020, "eDAC", 12345, 78);
		//java.lang.Object's Method : public String toString()
		System.out.println(s1);//implicitly calls s1.toString() : WHY ???????????????? : H.W (clue : javadocs)
		// 3 string objects n 1 student object
		// how many slots will u draw in student object : CP ----> Student
		// class,firstName,lastName,grYr,course,fees,marks
		//faculty object
		Faculty f1=new Faculty("Amit", "Kulkarni", 10, "java .net REST");
		System.out.println(f1);//f1.toString
	}

}
