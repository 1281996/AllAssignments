package com.mallika.bankjdbc;

import java.util.List;

public class BankService {
BankDAO bankDAO;

public BankDAO getBankDAO() {
	return bankDAO;
}

public void setBankDAO(BankDAO bankDAO) {
	this.bankDAO = bankDAO;
}

public void createTable(){
	bankDAO.createTable();
}
public String insertRow(int empId,String empName){
	return bankDAO.insertRow(empId, empName);
}

public List<BankDemo> fetchRecords(){
	return bankDAO.fetchRecords();
	
}

}
