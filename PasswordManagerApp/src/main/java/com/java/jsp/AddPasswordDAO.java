package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddPasswordDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public String addPassWordSafely(AddPassword AddPassword) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into savepassword(AddPassword)"+
				" values (?)";
		pst  = connection.prepareStatement(cmd);
		pst.setString(1, AddPassword.getAddPassword());
		pst.executeUpdate();
		return "Password is addess Suceesfully";
				
	}

}
