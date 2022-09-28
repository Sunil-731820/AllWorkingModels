package com.java.jsp;

public class Login {
	 private String userName;
	private String pinCode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", pinCode=" + pinCode + "]";
	}
	

	
	

}
