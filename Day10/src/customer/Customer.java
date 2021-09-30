package customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

	private String name, email, password;
	private double registrationAmount;
	private Date dob;
	// HAS-A
	private CustomerCategory category;
	// customer HAS-A Aadhar Card
	private AadharCard aadharCard;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String name, String email, String password, double registrationAmount, Date dob,
			CustomerCategory category) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.category = category;
	}
	

	public Customer(String email) {
		super();
		this.email = email;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (aadharCard == null)
			sb.append("Aadhar card not yet linked");
		else
			sb.append(aadharCard);
		return "Customer name = " + name + ", email = " + email + ", password " + password + " registrationAmount = "
				+ registrationAmount + ", dob = " + sdf.format(dob) + " category = " + category + " " + sb;
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

	// add a non static method, to link aadhar details to "this" customer
	public void linkAadharCard(String uid, String creationDate) throws ParseException {
		this.aadharCard = new AadharCard(uid, sdf.parse(creationDate));
	}

	// create non static nested class(inner class): to represent Aadhar card details
	// state,constr,toString
	class AadharCard {
		private String uid;
		private Date createdOn;

		public AadharCard(String uid, Date createdOn) {
			super();
			this.uid = uid;
			this.createdOn = createdOn;
		}

		@Override
		public String toString() {
			return "AadharCard uid=" + uid + ", createdOn=" + sdf.format(createdOn);
		}

	}

}
