package com.mallika.bank;

public class SavingsAccount extends BankAccount {
	private boolean isSalaryAccount;
	public SavingsAccount(String accountHolderName,int accountBalance){
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=true;
	}
public SavingsAccount(){
	this.isSalaryAccount=true;
}

public SavingsAccount(String accountHolderName,int accountBalance,boolean isSalaryAccount){
	super(accountHolderName,accountBalance);
	this.isSalaryAccount=true;
}
public boolean isSalaryAccount(){
	return isSalaryAccount;
}
}
