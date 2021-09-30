package com.app.org;

public class Emp {
	
	private int id;
	private String name;
	private int deptId;
	private double basic;
	
	public Emp(int id, String name, int deptId, double basic) {
		System.out.println(" In Emp constructor ");
		this.id=id;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + deptId + " " + basic;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public int getdeptId()
	{
		return deptId;
	}
	public double getbasic()
	{
		return basic;
	}
	
	public double computeNetSalary() {
		return 0;
	}
}
