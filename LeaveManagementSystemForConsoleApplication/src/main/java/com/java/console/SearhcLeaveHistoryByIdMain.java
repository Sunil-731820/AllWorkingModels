package com.java.console;

import java.sql.SQLException;
import java.util.Scanner;

public class SearhcLeaveHistoryByIdMain {
	public static void main(String[] args) {
		LeaveDetailsDAO dao = new LeaveDetailsDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Leave Id For Searching The Data ");
		int leaveId = sc.nextInt();
		try {
			LeaveDetails details = dao.searchLeaveHistoryByLeaveId(leaveId);
			if(details!=null) {
				System.out.println(details);
			}else {
				System.out.println("The Detaild Does Not Found By This Id ");
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
