package com.app.core;

import java.time.LocalDate;

public class Student {
	private String rollNo;
	private String name;
	private double gpa;
	private Subject sub;
	private LocalDate dob;
	public Student(String rollNo, String name, LocalDate dob, Subject sub, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gpa = gpa;
		this.sub = sub;
		this.dob = dob;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gpa=" + gpa + ", sub=" + sub + ", dob=" + dob + "]";
	}

	
}
