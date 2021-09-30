package customer;

import java.util.Arrays;

public enum CustomerCategory {
	SILVER(500,new String[] {"Platform"}),
	GOLD(100,new String[] {"Platform","Web Server"}),
	DIAMOND(1500,new String[] {"Platform","Webserver","App Deployment"}),
	PLATINIUM(2000,new String[] {"Platform","Webserver","App Deployment","Docker"});
	// additional state
	private double charges;
	private String[] services;
	//add parameterized constructor to initialize additional state
	private CustomerCategory(double charges,String[] services) {
		//super(name,ordinal):implicitly called : by javac
		this.charges=charges;
		this.services=services;
	}
	//for later validations : supply getters
	public double getCharges() {
		return charges;
	}
	public String[] getServices() {
		return services;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name()+" charges : "+charges+" Services "+Arrays.toString(services);
	}
	
	
}
