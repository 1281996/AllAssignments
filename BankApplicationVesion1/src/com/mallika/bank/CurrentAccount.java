package com.mallika.bank;

public class CurrentAccount extends BankAccount{
private double odLimit=20000 ;
public CurrentAccount(String accountHolderName,int accountBalance){
	super(accountHolderName,accountBalance);}

public void withDraw(double amount){
	double bal=this.accountBalance+odLimit;
	if(amount>bal){
		System.out.println("transcation fail");
	}
	else if(amount>accountBalance && amount<bal)
	{
		
	}
	
	  

}
}
