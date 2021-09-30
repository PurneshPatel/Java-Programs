package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp implements Comparable<Emp>{
//id , name , salary , deptId(enum),joinDate (Date)
	private int id;
	private String name;
	private double salary;
	private Department dept;
	private Date joinDate;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Emp(int id, String name, double salary, Department dept, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.joinDate = joinDate;
	}	
	

	public Emp(int id) {
		super();
		this.id = id;
	}



	@Override
	public String toString() {
		return "Emp id=" + id + ", name=" + name + ", salary=" + salary 
				+ ", dept=" + dept + ", joinDate="
				+ sdf.format(joinDate);

	}
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp equals");
		if(o instanceof Emp)
			return this.id==((Emp)o).id;
		return false;
	}
	
	@Override
	public int compareTo(Emp anotherEmp)
	{
		System.out.println("in compareTo");
		//sorting criteria : emp id
		if(this.id < anotherEmp.getId())
			return -1;
		if(this.id == anotherEmp.getId())
			return 0;
		return 1;		
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	

}
