package com.mallika.bank;



import java.util.List;

public class BankAccountepositoryImpl  {
	
	List<BankAccount> bankAccount;
  
	

	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public double getBalance(long accountId) {

		for (BankAccount index : bankAccount) {
			if (index.getAccountId() == accountId) {
				return index.getAccountBalance();

			}
		}
		return 0.0;
	}

	public double updateBalance(long accountId, double balance, String option) {

		double newBalance = 0;

		for (BankAccount index : bankAccount) {
			if (option.equals("withdraw")) {
				if (index.getAccountId() == accountId) {
					newBalance = index.getAccountBalance() - balance;
					index.accountBalance=newBalance;
				}
			}

			else if (option.equals("deposit")) {
				if (index.getAccountId() == accountId) {
					newBalance = index.getAccountBalance() + balance;
					index.accountBalance=newBalance;
				}
			}
		}
		return newBalance;

	}

}
