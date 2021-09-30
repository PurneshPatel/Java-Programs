package inheritance;

public class Faculty extends Person {
//firstName,lastName,yrs of experience , sme
	private int expInYears;
	private String sme;
	public Faculty(String firstName, String lastName, int expInYears, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty's constr");
		this.expInYears = expInYears;
		this.sme = sme;
	}
	//method overriding : i.e same method declaration , modifying the method definition
	public String toString()
	{
		return "Faculty "+super.toString()+" exp "+expInYears+" sme "+sme;
	}

	
	
}
