package com.java.console;

import java.sql.SQLException;

public class LeaveDetailsShowAllLeaveDataMain {
	public static void main(String[] args) {
		LeaveDetailsDAO dao = new LeaveDetailsDAO();
		try {
			LeaveDetails[] details = dao.getAllLeaveDetails();
			for(LeaveDetails leaveDetails : details) {
				System.out.println(leaveDetails);
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
