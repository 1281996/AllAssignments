package com.mallika.initialize;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initializing");
	}
  void getMessage(){
	  System.out.println("hello");
  }
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroying");
	}

}
