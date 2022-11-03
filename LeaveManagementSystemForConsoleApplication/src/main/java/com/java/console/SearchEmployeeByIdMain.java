package com.java.console;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchEmployeeByIdMain {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println("Enter the Employ Id ");
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		try {
			Employee employee = dao.searchEmployeeById(empId);
			if(employee!=null) {
				System.out.println(employee);
			}
			else {
				System.out.println("Employee Does not exist WIth This User Given Id");
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
