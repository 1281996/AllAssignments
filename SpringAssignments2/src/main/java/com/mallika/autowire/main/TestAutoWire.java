package com.mallika.autowire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mallika.autowire.classes.Traingle;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springautowire.xml");
		      Traingle traingle=context.getBean(Traingle.class);
		      traingle.draw();

	}

}
