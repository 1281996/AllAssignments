package com.mallika.servlet1;

public interface IUserDAO {
public String getUSerType(String userName,String passWord);
public void addUser(User user);
public void changePassword(String userName,String oldPassword,String newPassword);
public void remove(String userName);
}
