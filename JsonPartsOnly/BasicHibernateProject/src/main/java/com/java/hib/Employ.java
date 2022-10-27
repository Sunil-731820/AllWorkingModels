package com.java.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employ")
public class Employ {
	
	@Id
	@Column(name = "EmployId")
	private int employId;
	
	@Column(name="employName")
	private String employName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="salary")
	private double salary;
	
	
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
