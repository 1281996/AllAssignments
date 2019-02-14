package com.mallika.bankjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("bankspringjdbc.xml");
BankController controller=context.getBean(BankController.class);
//controller.createTable();
controller.insertRow(102, "Mallika");
controller.insertRow(103, "Sindhu");
controller.insertRow(104, "Arpita");
for (BankDemo index : controller.fetchRecords()) {
	System.out.println(index.empId+" "+index.empName);
}
/*System.out.println(controller.fetchRecords());*/
	}

}
