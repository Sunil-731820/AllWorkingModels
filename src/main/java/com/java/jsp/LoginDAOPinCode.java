package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAOPinCode {
	
	Connection connection;
	PreparedStatement pst;
	
	DecryptionOfPinCode dec1 = new DecryptionOfPinCode();
	
	public int loginUsingPinCode(String userName , String pinCode) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from loginandregister where userName = ? and pinCode = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, userName);
//		EncrptionOfPinCode erc1 = new EncrptionOfPinCode();
//		String pin11 = erc1.encrypt(pinCode);
//		String pin12 = dec1.decrypt(pin11);
//		pst.setString(2, pin12);
//		String plain = DecryptionOfPinCode.decrypt(pinCode);
//		pst.setString(2, plain);
		pst.setString(2, pinCode);
		ResultSet res = pst.executeQuery();
		res.next();
		int count = res.getInt("cnt");
		String plain1 = EncrptionOfPinCode.encrypt(pinCode);
//		System.out.println(plain1);
		String plainText = DecryptionOfPinCode.decrypt(plain1);
//		System.out.println(plainText);
		return count;
	}
	
	
	public String RegisterUsingPinCode(Register register) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into loginandregister(userName , pinCode)"+
				" values (?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1,register.getUserName());
		pst.setString(2, register.getPinCode());
		pst.executeUpdate();
		return "Register SuccessFully";
	}

}


