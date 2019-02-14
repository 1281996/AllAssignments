package com.mallika.spring;

public class Customer {
	int custId;
String custName;
String custNumber;
Address adress;
public Address getAdress() {
	return adress;
}
public void setAdress(Address adress) {
	this.adress = adress;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustNumber() {
	return custNumber;
}
public void setCustNumber(String custNumber) {
	this.custNumber = custNumber;
}

}
