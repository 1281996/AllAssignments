package com.mallika.bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mallika.bank.interfac.BankAccountController;



public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 ApplicationContext context =new ClassPathXmlApplicationContext("springbank.xml");
	     
		 BankAccountControllerImpl accountController=  context.getBean(BankAccountControllerImpl.class);
	    
	    System.out.println("Deposit"+accountController.deposit(101,1007,"deposit"));
	    System.out.println("WithDraw"+accountController.deposit(101,1000,"withdraw"));
	    System.out.println("Deposit"+accountController.deposit(101,100,"deposit"));
	    System.out.println(accountController.getBalance(101));
	    System.out.println("Fund TRansfer"+accountController.fundTransfer(101, 102, 500));
	    System.out.println(accountController.getBalance(101));
	    System.out.println(accountController.getBalance(102));
		
		 /*BankAccountepositoryImpl bankAccountepositoryImpl=context.getBean(BankAccountepositoryImpl.class);
	   bankAccountepositoryImpl.updateBalance(101, 100, "deposit")*/;
	}

}
