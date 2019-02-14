package com.mallika.bank;

public class SavingAccount2 extends SavingsAccount implements Insurance{
@Override
public double getInsuranceAccount() {
	// TODO Auto-generated method stub
	return 50000;
}
@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "mallika";
	}
}
