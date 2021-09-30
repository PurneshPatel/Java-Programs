package com.app.org;

public class Mgr extends Emp {

	private double perfomanceBonus;

	public Mgr(int id, String name, int deptId, double basic, double perfomanceBonus) {
		super(id, name, deptId, basic);
		System.out.println(" In Mgr constructor ");
		this.perfomanceBonus = perfomanceBonus;
	}

	@Override
	public String toString() {
		return " mgr details " + super.toString() + " perfomance Bonus " + perfomanceBonus;
	}

	public double computeNetSalary() {
		return getbasic() + perfomanceBonus;
	}

	public double getperfomanceBonus() {
		return perfomanceBonus;
	}

}
