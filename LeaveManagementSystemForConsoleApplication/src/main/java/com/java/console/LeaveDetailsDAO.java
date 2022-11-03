package com.java.console;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveDetailsDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public LeaveDetails[] getAllLeaveDetails() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history";
		pst = connection.prepareStatement(cmd);
		List<LeaveDetails> ListOfLeaveDetails = new ArrayList<LeaveDetails>();
		ResultSet res = pst.executeQuery();
		LeaveDetails leaveDetail = null;
		while(res.next()) {
			leaveDetail = new LeaveDetails();
			leaveDetail.setLeaveId(res.getInt("LEAVE_ID"));
			leaveDetail.setNoOfDays(res.getInt("LEAVE_NO_OF_DAYS"));
			leaveDetail.setManagerComments(res.getString("LEAVE_MNGR_COMMENTS"));
			leaveDetail.setEmpId(res.getInt("EMP_ID"));
			leaveDetail.setLeaveStartDate(res.getDate("LEAVE_START_DATE"));
			leaveDetail.setLeaveEndDate(res.getDate("LEAVE_END_DATE"));
			leaveDetail.setLeaveType(LeaveType.valueOf(res.getString("LEAVE_TYPE")));
			leaveDetail.setLeaveStatus(LeaveStatus.valueOf(res.getString("LEAVE_STATUS")));
			leaveDetail.setLeaveReason(res.getString("LEAVE_REASON"));
			ListOfLeaveDetails.add(leaveDetail);
			
		}
		
		return ListOfLeaveDetails.toArray(new LeaveDetails[ListOfLeaveDetails.size()]);
		
	}
	
	
	public LeaveDetails searchLeaveHistoryByLeaveId(int leaveId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where LEAVE_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet res = pst.executeQuery();
		LeaveDetails leaveDetails = null;
		if(res.next()) {
			leaveDetails = new LeaveDetails();
			leaveDetails.setLeaveId(res.getInt("LEAVE_ID"));
			leaveDetails.setNoOfDays(res.getInt("LEAVE_NO_OF_DAYS"));
			leaveDetails.setManagerComments(res.getString("LEAVE_MNGR_COMMENTS"));
			leaveDetails.setEmpId(res.getInt("EMP_ID"));
			leaveDetails.setLeaveStartDate(res.getDate("LEAVE_START_DATE"));
			leaveDetails.setLeaveEndDate(res.getDate("LEAVE_END_DATE"));
			leaveDetails.setLeaveType(LeaveType.valueOf(res.getString("LEAVE_TYPE")));
			leaveDetails.setLeaveStatus(LeaveStatus.valueOf(res.getString("LEAVE_STATUS")));
			leaveDetails.setLeaveReason(res.getString("LEAVE_REASON"));
			
		}
		return leaveDetails;
		
		
	}

}
