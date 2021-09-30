package tester;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

/*
 * Objective : Arrange an event to invite students n faculties
(eg : EventOrganizer app : tester --main / scanner)
Prompt user for event capacity.
Create suitable data structure to hold the participant details
eg : Person[] participants=....
Options 
1. Register Student : 
2. Register Faculty : 
3. Display participant details : for-each (is null checking required : YESSS)
10. Exit
 */
public class EventOrganizer {

	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter event capacity");
		// Create suitable data structure to hold the participant details
		Person[] participants = new Person[sc.nextInt()];// 100
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println(
					"Menu : 1. Register Student 2. Register Faculty 3. Display participant details" + "10 Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1: // register student
				if (counter < participants.length) {
					System.out.println("Enter student details :  fn,  ln,  gradYear,  courseName,  fees,  marks");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());
				} else
					System.out.println("Event Full!!!!!!!");
				break;
			case 2:
				// register faculty
				if (counter < participants.length) {
					System.out.println("Enter faculty details :  fn,  ln,  exp in yrs sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full!!!!!!!");

				break;
			case 3: //display all participant details
				for (Person p : participants)//p=participants[0] ...... {f1,f2,s1,s2,s3,s4,f3,.................}
					if(p != null)
						System.out.println(p);//p.toString
				break;

			case 10:
				exit = true;
				break;
			}
		}

		sc.close();
		System.out.println("main over....");

	}

}
