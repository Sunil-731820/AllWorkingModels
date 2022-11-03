package com.java.console;

import java.sql.SQLException;

public class CountNumberOfEmployMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDAO dao = new EmployeeDAO();
		dao.getNumberOfEmployusingStreamCount();
	}
}
