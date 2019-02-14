package com.mallika.bankjdbc;

import java.util.List;

public class BankController {
	BankService bankService;

	public BankService getBankService() {
		return bankService;
	}

	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}
	
	
	public void createTable(){
		bankService.createTable();
	}
	public String insertRow(int empId,String empName){
		return bankService.insertRow(empId, empName);
	}  
	
	public List<BankDemo> fetchRecords(){
		return bankService.fetchRecords();
		
	}
}
