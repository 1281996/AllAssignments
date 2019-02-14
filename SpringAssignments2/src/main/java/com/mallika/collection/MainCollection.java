package com.mallika.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mallika.spring.Customer;

public class MainCollection {
	public static void main(String[] args) {
		
	
	 ApplicationContext context =new ClassPathXmlApplicationContext("springquestion.xml");
     
    Question question= context.getBean(Question.class);
    for(String answer:question.getAnswer1()){
    	System.out.println(answer);
    }
    
    
}
}
