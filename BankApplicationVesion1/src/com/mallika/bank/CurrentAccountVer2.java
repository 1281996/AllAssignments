package com.mallika.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{
public CurrentAccountVer2(String accountHolderName, int accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}
@Override
public double getInsuranceAccount() {
	// TODO Auto-generated method stub
	return 600000;
}
@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "santhi";
	}
}
