package com.mallika.collections;

public class BankAccount {
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;

public BankAccount(int accountNo,String accountHolderName,double accountBalance) {
	// TODO Auto-generated constructor stub
	this.accountNo=accountNo;
	this.accountHolderName=accountHolderName;
	this.accountBalance=accountBalance;
}


public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}

@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "]";
}

}
