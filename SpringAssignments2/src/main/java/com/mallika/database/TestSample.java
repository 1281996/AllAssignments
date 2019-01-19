package com.mallika.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context =new ClassPathXmlApplicationContext("springjdbc.xml");
	     
		 Sample sample= context.getBean(Sample.class);
		 sample.insertRow();
		 sample.createTable();
	}

}
