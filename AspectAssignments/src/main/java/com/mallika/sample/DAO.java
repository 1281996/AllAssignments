package com.mallika.sample;

public class DAO {
	Bank bank;
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getAccountID() {
		return bank.getAccountID();
	}

}
