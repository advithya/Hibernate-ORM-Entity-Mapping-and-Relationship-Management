package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	private String eName;
	private double eSal;
	@Id
	private int eID;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eName, double eSal, int eID) {
		super();
		this.eName = eName;
		this.eSal = eSal;
		this.eID = eID;
	}
	
}
