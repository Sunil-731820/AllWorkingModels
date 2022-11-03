package com.java.console.EmployDataFromFileToDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.java.console.ConnectionHelper;

public class InsertingWholeDataFromFileToDB {
	static Connection connection;
	static PreparedStatement pst;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			List<EmployPOJOFileDataReading1> listOfDataFromFile = EmployAllDataGettingFromFile.readDataFromFile();
			Iterator itr = listOfDataFromFile.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
//			connection = ConnectionHelper.getConnection();
//			String cmd = "insert into employee(EMP_ID,EMP_NAME,EMP_MAIL,EMP_MOB_NO,EMP_DT_JOIN,EMP_DEPT,EMP_MANAGER_ID,EMP_AVAIL_LEAVE_BAL) "
//					+ " values(?,?,?,?,?,?,?,?)";
//			pst = connection.prepareStatement(cmd);
//			for(int i=0;i<listOfEmployee.size();i++) {
////				pst.setInt(i, employees.);
//			}
//			
//			System.out.println("Enter Leave Start Date (yyyy-MM-dd)   ");
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			java.util.Date lstartDate =  sdf.parse(sc.next());
//			java.sql.Date startDate = new java.sql.Date(lstartDate.getTime());
//			for(EmployPOJOFileDataReading1 employee : listOfDataFromFile) {
//				pst.setInt(1, employee.getEmpId());
//				pst.setString(2, employee.getEmpName());
//				pst.setString(3, employee.getEmpEmail());
//				pst.setString(4, employee.getEmpMobile());
//				pst.setDate(5, new java.sql.Date(employee.getEmpDOJ().getTime()) );
//				pst.setString(6, employee.getEmpDept());
//				pst.setInt(7, employee.getMgrId());
//				pst.setInt(8, employee.getLeaveAvail());
//				pst.executeUpdate();
//				
//			}
//			System.out.println("The Data Save to The DataBase SuccesFully");
//			return listOfEmploy;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
