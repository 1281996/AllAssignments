package com.mallika.sample;

public class Service {
	
	DAO dao;
	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public int getAccountID() {
		return dao.getAccountID();
	}
}
