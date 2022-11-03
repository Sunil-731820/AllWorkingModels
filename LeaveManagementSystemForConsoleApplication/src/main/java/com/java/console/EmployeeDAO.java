package com.java.console;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeDAO {
	
	Connection connection;
	PreparedStatement pst;
	
//	1 : Array Of Employee (show All Employ From the Database )
	public Employee[] showAllEmployee() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *From employee";
		pst = connection.prepareStatement(cmd);
		List<Employee> ListofEmployee = new ArrayList<Employee>();
		ResultSet res = pst.executeQuery();
		Employee employee = null;
		while(res.next()) {
			employee = new Employee(0, cmd, cmd, cmd, null, cmd, 0, 0);
			employee.setEmpId(res.getInt("EMP_ID"));
			employee.setEmpName(res.getString("EMP_NAME"));
			employee.setEmpEmail(res.getString("EMP_MAIL"));
			employee.setEmpMobile(res.getString("EMP_MOB_NO"));
			employee.setEmpDOJ(res.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(res.getString("EMP_DEPT"));
			employee.setMgrId(res.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(res.getInt("EMP_AVAIL_LEAVE_BAL"));
			ListofEmployee.add(employee);
		}
		return ListofEmployee.toArray(new Employee[ListofEmployee.size()]);
		
	}
	
//	2 : Search a Single Employee on the basis of empId;
	
	public  Employee searchEmployeeById(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from employee where EMP_ID =?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet res = pst.executeQuery();
		Employee employee = null;
		if(res.next()) {
			employee = new Employee(empId, cmd, cmd, cmd, null, cmd, empId, empId);
			employee.setEmpId(res.getInt("EMP_ID"));
			employee.setEmpName(res.getString("EMP_NAME"));
			employee.setEmpEmail(res.getString("EMP_MAIL"));
			employee.setEmpMobile(res.getString("EMP_MOB_NO"));
			employee.setEmpDOJ(res.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(res.getString("EMP_DEPT"));
			employee.setMgrId(res.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(res.getInt("EMP_AVAIL_LEAVE_BAL"));
			
		}
		return employee;
		
	}
	
	public void getNumberOfEmployusingStreamCount() throws ClassNotFoundException, SQLException{
		EmployeeDAO dao = new EmployeeDAO();
		Employee[] arrOfEmploy = dao.showAllEmployee();
		System.out.println("The Array Of the Employ is ");
		for(Employee employee : arrOfEmploy) {
			System.out.println(employee);
		}
		System.out.println("Converting the Array To The List");
//		I am Calling The function Array to List COnvertor
		List<Employee> list = convertArrayToList(arrOfEmploy);
		for(Employee employee: list) {
			System.out.println(employee);
		}
//		Counting the Number of Employees USing Count() in Stream ApI
		long countNumOfEmpList = list.stream()
				.count();
		System.out.println("The Number Of The EMploy is "+ countNumOfEmpList);
		
//		I am Going To filter the Data on The Basis of startName is "Abhisek"
		System.out.println("The List Of The Employ Start With A is ");
		List<Employee> listOfEmploy = list.stream()
				.filter(name -> name.getEmpName().startsWith("A"))
				.collect(Collectors.toList());
		 for(Employee employee: listOfEmploy) {
			 System.out.println(employee);
		 }
	}
	
//	Converting Array To List in Java 
	public static <T> List<T> convertArrayToList(T array[])
	{
		// create a list from the Array
		return Arrays.stream(array).collect(
			Collectors.toList());
	}
//	
//	Convert Date to String 
	public static String convertDateToString(String date)
    {
  
        // Get an instance of LocalTime
        // from date
        LocalDate givenDate = LocalDate.parse(date);
  
        // Convert the given date into a
        // string using toString()method
        String dateToString
            = givenDate.toString();
  
        // Return the result
        return (dateToString);
    }
	
	
	
	public List<Employee> AddListOfDataToDataBase() throws ParseException{
		List<Employee> listOfEmploy = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leave Start Date (yyyy-MM-dd)   ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date lstartDate =  sdf.parse(sc.next());
		java.sql.Date startDate = new java.sql.Date(lstartDate.getTime());
//		LocalDate givendate = LocalDate.parse("2022-12-12");
//		String dateToString = givendate.toString();
		listOfEmploy.add(new Employee(410, "Sunil", "Sunil@gmail.com","72727727",startDate, "Infinite", 99, 12));
		
		System.out.println("Enter Leave Start Date (yyyy-MM-dd)   ");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date lstartDate1 =  sdf1.parse(sc.next());
		java.sql.Date startDate1 = new java.sql.Date(lstartDate1.getTime());
		System.out.println(startDate1);
		listOfEmploy.add(new Employee(421, "Sunil", "Sunil@gmail.com","72727727",startDate1, "Infinite", 88, 12));
		System.out.println(startDate1.toString());
		return listOfEmploy;
		
	}
	
	public List<Employee> AddTheListOfDataToDatabase(List<Employee> employees) throws ClassNotFoundException, SQLException, ParseException{
		System.out.println("The AddTheListOfDataToDatabase ");
		List<Employee> listOfEmployee = AddListOfDataToDataBase();
		System.out.println("the List Of the Employ is ");
		for(Employee employee: listOfEmployee) {
			System.out.println(employee);
		}
		System.out.println("Establishing the Connections");
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into employee(EMP_ID,EMP_NAME,EMP_MAIL,EMP_MOB_NO,EMP_DT_JOIN,EMP_DEPT,EMP_MANAGER_ID,EMP_AVAIL_LEAVE_BAL) "
				+ " values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
//		for(int i=0;i<listOfEmployee.size();i++) {
////			pst.setInt(i, employees.);
//		}
//		
		for(Employee employee : listOfEmployee) {
			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getEmpName());
			pst.setString(3, employee.getEmpEmail());
			pst.setString(4, employee.getEmpMobile());
			pst.setDate(5, employee.getEmpDOJ());
			pst.setString(6, employee.getEmpDept());
			pst.setInt(7, employee.getMgrId());
			pst.setInt(8, employee.getLeaveAvail());
			pst.executeUpdate();
			
		}
		System.out.println("The Data Save to The DataBase SuccesFully");
		return listOfEmployee;
	}
	
	

}
