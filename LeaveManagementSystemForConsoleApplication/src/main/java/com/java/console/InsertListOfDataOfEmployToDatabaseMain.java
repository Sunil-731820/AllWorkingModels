package com.java.console;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class InsertListOfDataOfEmployToDatabaseMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDAO dao = new EmployeeDAO();
		try {
			List<Employee> ListOfEmployee = dao.AddListOfDataToDataBase();
			for(Employee employee : ListOfEmployee) {
				System.out.println(employee);
			}
			System.out.println("I am Calling AddDatabase()");
			List<Employee> listOfEmployee = dao.AddTheListOfDataToDatabase(ListOfEmployee);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
