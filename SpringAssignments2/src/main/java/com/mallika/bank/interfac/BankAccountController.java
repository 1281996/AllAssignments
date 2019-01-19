package com.mallika.bank.interfac;

public interface BankAccountController   {
	public double withdraw(long accountId, double balance,String option);
	public double deposit(long accountId, double balance, String option );
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
	public double getBalance(long accountId);
}
