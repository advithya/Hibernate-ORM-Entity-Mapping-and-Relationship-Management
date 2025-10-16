package com.sample;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
 
	@Id
	private int stid;
	private String stname;
	private long stcontsct;
	
	@Embedded
	private Course course;


	public int getStid() {
		return stid;
	}


	public void setStid(int stid) {
		this.stid = stid;
	}


	public String getStname() {
		return stname;
	}


	public void setStname(String stname) {
		this.stname = stname;
	}


	public long getStcontsct() {
		return stcontsct;
	}


	public void setStcontsct(long stcontsct) {
		this.stcontsct = stcontsct;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int stid, String stname, long stcontsct) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stcontsct = stcontsct;
	}
	
	
}
