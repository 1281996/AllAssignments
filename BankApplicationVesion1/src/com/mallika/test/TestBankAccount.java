package com.mallika.test;
import com.mallika.bank.BankAccount;
import com.mallika.bank.CurrentAccountVer2;
import com.mallika.bank.SavingAccount2;
import com.mallika.bank.CurrentAccount;
import  com.mallika.bank.SavingsAccount;
public class TestBankAccount {
	public static void testSavingsAccount(){
		SavingsAccount savingsAcc=new SavingsAccount();
	
		System.out.println("balance is"+ savingsAcc.getAccountBalance());
		System.out.println("Account number is"+ savingsAcc.getAccountNo());
		savingsAcc.deposit(60000);
		System.out.println("---------------");
		System.out.println("balance is"+ savingsAcc.getAccountBalance());
		savingsAcc.withDraw(1000);
		System.out.println("balance is"+ savingsAcc.getAccountBalance());
		
	}
	public static void testCurrentAccount(){
		CurrentAccount currentAcc=new CurrentAccount("mallika",40000);
		System.out.println("balance is"+ currentAcc.getAccountBalance());
		System.out.println("Account number is"+ currentAcc.getAccountNo());
		currentAcc.deposit(60000);
		System.out.println("---------------");
		System.out.println("balance is"+ currentAcc.getAccountBalance());
		currentAcc.withDraw(1000);
		System.out.println("balance is"+ currentAcc.getAccountBalance());
		
	}
	public static BankAccount getBankAccount(String accountType){
		BankAccount acc=null;
		 if(accountType.equals("savings")){
			 acc=new SavingsAccount("mallika",5000);
		 }
		 else if(accountType.equals("current")){
			 acc=new CurrentAccount("mallika",5000);
		 }
		 else{
			 acc=null;
		 }
		 return acc;
	}
	
	
/*public void testBankAccountMethod(){
	BankAccount bank=new BankAccount();
	bank.setAccountHolderName("mallika");
	
}*/
public static void main(String args[]){
	//testSavingsAccount();
	//testCurrentAccount();
	// BankAccount acc=getBankAccount("current");
	 //System.out.println("balance is"+ acc.getAccountBalance());
		//System.out.println("Account number is"+ acc.getAccountNo());
		//acc.deposit(60000);
	 SavingAccount2 acc=new SavingAccount2();
	 acc.withDraw(1000);
	 acc.deposit(1000);
	 System.out.println(acc.getInsuranceName());
	 //CurrentAccountVer2 acc=new CurrentAccountVer2();
	 acc.withDraw(1000);
	 acc.deposit(1000);
	 System.out.println(acc.getInsuranceName());
	 
}
}
