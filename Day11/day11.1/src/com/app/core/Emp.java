package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
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

}
