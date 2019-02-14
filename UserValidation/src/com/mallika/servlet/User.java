package com.mallika.servlet;

public class User {
String userName;
String passWord;
String userType;
public User(String userName, String passWord, String userType) {
	super();
	this.userName = userName;
	this.passWord = passWord;
	this.userType = userType;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", passWord=" + passWord
			+ ", userType=" + userType + "]";
}

}
