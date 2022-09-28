package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestoreDAO {
	Connection connection;
	PreparedStatement pst;
	
	public Questions getIdMatchQuestion(int id) throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from questions where id = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, id);
		ResultSet res = pst.executeQuery();
		Questions question = null;
		if(res.next()) {
			 question =  new Questions(); 
//			System.out.println("Question parts here okay");
			 question.setId(res.getInt("id"));
			 question.setNickName(res.getString("nickName"));
			 question.setSchoolName(res.getString("schoolName"));
			 question.setPetName(res.getString("petName"));
			 question.setFavSports(res.getString("favSports"));
			 question.setFavIdeal(res.getString("favIdeal"));
		}
		return question;
		
	}

}
