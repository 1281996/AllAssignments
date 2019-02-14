package com.mallika.servlet1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewVersionDAO implements IUserDAO {

	@Override
	public String getUSerType(String userName, String passWord) {
		Connection connection=ConnectionFactory.getConnection();
		System.out.println(userName);
		try{
		PreparedStatement ps=connection.prepareStatement("select * from user1 where userName=? and passWord=?");
		
		ps.setString(1, userName);
		ps.setString(2, passWord);
	     ResultSet rs=ps.executeQuery();
	    while(rs.next()){
		if(rs.getString("userName").equals(userName)&&rs.getString("passWord").equals(passWord))
		{
			System.out.println(userName);
			return rs.getString("userType");
		}
	    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		throw new InvalidUserException("invalid username and password");
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String userName, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String userName) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		System.out.println(new NewVersionDAO().getUSerType("mallikadf", "ykuntadg"));
	}

}
