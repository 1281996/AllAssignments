package com.mallika.initialize;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mallika.collection.Question;

public class MainInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("springinitialize.xml");
	     
	    Customer customer=(Customer) context.getBean("customer");
	    customer.getMessage();
		
	}

}
