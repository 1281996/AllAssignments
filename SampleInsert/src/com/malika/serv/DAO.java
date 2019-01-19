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

		return "s";
	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return "so";
	}

	public String validUser(String userName1, String passWord1) {
		Connection connection=ConnectionFactory.getConnection();
		
		
		
		
		
		try{
			PreparedStatement ps=connection.prepareStatement("select * from user2 where  firstname=? and passWord=?");
			
			ps.setString(1, userName1);
			ps.setString(2, passWord1);
		     ResultSet rs=ps.executeQuery();
		    while(rs.next()){
			if(rs.getString("firstname").equals(userName1)&&rs.getString("passWord").equals(passWord1))
			{
				System.out.println(userName1);
				return "valid";
			}
		    }
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		return null;
			
			
	}

}
