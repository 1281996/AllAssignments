package com.malika.serv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DAO {
	
	public String getSendData(String firstName,String lastName,String passWord) {
		Connection connection=ConnectionFactory.getConnection();
		System.out.println(firstName);
		System.out.println(passWord);
		
		String insertTableSQL = "INSERT INTO user2"
				+ "(firstName, lastName, passWord) VALUES"
				+ "(?,?,?)";

		try{
		PreparedStatement ps=connection.prepareStatement(insertTableSQL );
		
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, passWord);
		ps.executeUpdate();

		return "s1";
	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return "s";
	}

}
