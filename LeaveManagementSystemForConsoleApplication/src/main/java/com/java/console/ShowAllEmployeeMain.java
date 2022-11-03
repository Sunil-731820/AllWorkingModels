package com.java.console;

import java.sql.SQLException;

public class ShowAllEmployeeMain {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		try {
			Employee[] arrEmploy = dao.showAllEmployee();
			System.out.println("The Array Of the EMploy is ");
			System.out.println(arrEmploy.toString());
			for(Employee employee : arrEmploy) {
				System.out.println(employee);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
