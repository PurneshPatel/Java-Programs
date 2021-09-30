package inheritance;

public class Person {
	// tight encapsulation
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		// super();
		System.out.println("in person's constr");
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	//add a getter for the first name
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	

}
