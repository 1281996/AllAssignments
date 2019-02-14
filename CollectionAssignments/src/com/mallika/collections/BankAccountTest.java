package com.mallika.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountTest implements Comparator<BankAccount> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set<BankAccount> set=new TreeSet(new BankAccountTest());
	set.add(new BankAccount(128,"mallika",2000.0));
	set.add(new BankAccount(124,"sallika1",21000.0));
	set.add(new BankAccount(125,"nallika2",20000));	
	for(BankAccount bank:set){
		System.out.println(bank);
	}
  
	}

	@Override
	public int compare(BankAccount bank1, BankAccount bank2) {
		// TODO Auto-generated method stub
	int compare=bank1.getAccountHolderName().compareTo(bank2.getAccountHolderName());
		if(compare>0)
			return 1;
		else if(compare==0)
			return 0;
		return -1;
			
	}
	}
	


