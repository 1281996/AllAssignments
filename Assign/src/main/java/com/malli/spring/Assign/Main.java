package com.malli.spring.Assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Hello msg = (Hello) context.getBean("Hello.class");
		msg.getMsg();
	}
}