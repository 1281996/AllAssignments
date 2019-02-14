package com.mallika.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
	       
	      Customer customer= context.getBean(Customer.class);
	       System.out.println(customer.adress.getCity());
	       System.out.println(customer.adress.getCountry());
	       System.out.println(customer.adress.getStreet());
	       System.out.println(customer.adress.getZip());
	       System.out.println(customer.getCustId());
	}

}
