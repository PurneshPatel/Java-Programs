package com.app.org;

public class Worker extends Emp {
	private double hoursWorked;
	private double hourlyRate;

	public Worker(int id, String name, int deptId, double basic, double hoursWorked, double hourlyRate) {
		super(id, name, deptId, basic);
		System.out.println(" In Worker constructor ");
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;

	}

	@Override
	public String toString() {
		return "Worker Details" + super.toString() + "hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate;
	}

	public double computeNetSalary() {
		return getbasic() + (hoursWorked * hourlyRate);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

}
