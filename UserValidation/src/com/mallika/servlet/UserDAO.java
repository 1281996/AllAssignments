package com.mallika.servlet;

import java.util.ArrayList;

import com.mallika.servlet.InvalidException;

public class UserDAO  {
	ArrayList<User> userList;
	public UserDAO(){
	userList=new ArrayList<User>();
	userList.add(new User("mallika","ykunta","Admin"));
	userList.add(new User("santhi","ykunta","Admin"));
	userList.add(new User("prasad","ykunta","User"));
	}
 public String getUserType(String userName,String passWord){
	
	for(User user:userList){
		if(userName.equals(user.getUserName())&& passWord.equals(user.getPassWord())){
			return user.getUserType();
		}
	}
	throw new InvalidException("invalid");
	
}
}
