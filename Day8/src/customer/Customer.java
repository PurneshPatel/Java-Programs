package customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	@SuppressWarnings("unused")
	private String name, email, password;
	private double registrationAmount;
	private Date dob;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String name, String email, String password, double registrationAmount, Date dob) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", registrationAmount=" + registrationAmount + ", dob="
				+ dob + "]";
	}

	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in Customer equals...");
		if (anotherObject instanceof Customer) {
			Customer c = (Customer) anotherObject;
			return this.email.equals((c).email);
		}
		return false;
	}

}
