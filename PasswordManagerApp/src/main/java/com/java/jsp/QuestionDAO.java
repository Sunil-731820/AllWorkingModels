package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.w3c.dom.NameList;

import jakarta.validation.constraints.AssertFalse.List;

public class QuestionDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public int generateQuestionsNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select max(id)+1 ano from questions ";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		res.next();
		int agentId = res.getInt("ano");
		return agentId;
	}
	
	
	public String AddQuestion(Questions questions) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		int counter = 0;
		String cmd = "insert into questions(id , nickName , schoolName,petName,favSports,favIdeal)"+
				" values (?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,questions.getId());
		pst.setString(2, questions.getNickName());
		pst.setString(3, questions.getSchoolName());
		pst.setString(4, questions.getPetName());
		pst.setString(5, questions.getFavSports());
		pst.setString(6, questions.getFavIdeal());
		pst.executeUpdate();
		return "Questions Addess SuccessFully";
	}
	
	
	
	public int counter() {
		int count = 5;
		return count;
	}

}
