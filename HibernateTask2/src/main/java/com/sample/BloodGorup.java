package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class BloodGorup {
	
	@Id
	private int bgid;
	private String bgName;
	public int getBgid() {
		return bgid;
	}
	public void setBgid(int bgid) {
		this.bgid = bgid;
	}
	public String getBgName() {
		return bgName;
	}
	public void setBgName(String bgName) {
		this.bgName = bgName;
	}
	public BloodGorup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodGorup(int bgid, String bgName) {
		super();
		this.bgid = bgid;
		this.bgName = bgName;
	}
	
	
}
