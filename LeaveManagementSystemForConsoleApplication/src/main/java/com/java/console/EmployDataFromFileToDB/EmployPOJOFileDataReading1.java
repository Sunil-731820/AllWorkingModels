package com.java.console.EmployDataFromFileToDB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
//import java.util.Date;


public class EmployPOJOFileDataReading1 {
	
	private int empId;
	private String empName;
	private String empEmail;
	private String empMobile;
	private Date empDOJ;
	private String empDept;
	private int mgrId;
	private int leaveAvail;
	
	
	
	public EmployPOJOFileDataReading1(int empId, String empName, String empEmail, String empMobile, Date empDOJ,
			String empDept, int mgrId, int leaveAvail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobile = empMobile;
		this.empDOJ = empDOJ;
		this.empDept = empDept;
		this.mgrId = mgrId;
		this.leaveAvail = leaveAvail;
	}
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public String getEmpMobile() {
		return empMobile;
	}


	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}


	public Date getEmpDOJ() {
		return empDOJ;
	}


	public void setEmpDOJ(Date empDOJ) {
		this.empDOJ = empDOJ;
	}


	public String getEmpDept() {
		return empDept;
	}


	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}


	public int getMgrId() {
		return mgrId;
	}


	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}


	public int getLeaveAvail() {
		return leaveAvail;
	}


	public void setLeaveAvail(int leaveAvail) {
		this.leaveAvail = leaveAvail;
	}


	@Override
	public String toString() {
		return "EmployPOJOFileDataReading [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail
				+ ", empMobile=" + empMobile + ", empDOJ=" + empDOJ + ", empDept=" + empDept + ", mgrId=" + mgrId
				+ ", leaveAvail=" + leaveAvail + "]";
	}
	
	

	
	
	
	
	
	

}
