package com.mallika.bank; // collection of logical classes

public abstract class BankAccount {
	//static variable doesn't dependent object
	//it is one copy among objects
	private static int autoAccountNo;
	// instance variable or class variable
	//we can't use instance variable if object not created
   private int accountNo;
    private String accountHolderName;
    protected double accountBalance;
   //init block 
    //before invokation of constructor init block
    //reduce the reduency values
    {
    	accountNo=++autoAccountNo;
    	
    }
    
    //constructor overloading will supply values bfeore and after 
    //constructor overloading
    //in bank offering two types of account creation 
    //default constructor
    public BankAccount()
    {
    	//intializing instance variables
    	//at the time object creation constuctor executes 
    	
    	accountHolderName="unknow";
    	accountBalance=0;
    	
    }
    //parameterized constuctor
    public BankAccount(String accountHolderName,double accountBalance){
    	
    	this.accountHolderName=accountHolderName;
    	this.accountBalance=accountBalance;
    	
    }
    public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName; //modifying existing values or //modfying member value
	}
    public double getAccountBalance() {
		return accountBalance;
	}
    public String getAccountHolderName() {
		return accountHolderName;
	}
    public int getAccountNo() {
		return accountNo;
	} 
    public void withDraw(double amount){
    	//this.accountBalance-=amount;
    	if(amount<=0){
    		System.out.println("plz enter valid amount");
    	}
    	else if(amount>accountBalance){
    		System.out.println("ur account bal is"+accountBalance);
    		System.out.println("Plz enter with in the account balance");
    	}
    	else{
    		accountBalance=accountBalance-amount;
    		   if(accountBalance<1000){
    			   System.out.println("Minimum Balance to be maintained is Rs1000");
    		   }
    		   else{
    			   System.out.println("ur account balance"+accountBalance);
    			   System.out.println("Your withdrawal money is"+amount);
    			   
    		   }
    	}
    }
    public void deposit(double amount){
    	//this.accountBalance+=amount;
    	if(amount<=0){
    		System.out.println("we cannot the negative bal to your account");
    		
    	}
    	else
    	{
    		accountBalance=accountBalance+amount;
    		System.out.println("ur account balance"+accountBalance);
    	}
    }
    public static void main(String args[]){
    	//BankAccount account=new BankAccount();
    	//BankAccount account2=new BankAccount("mallika",40000);
    	
    	
    }
    

}
