package com.mallika.uttil;

import com.mallika.servlet1.IUserDAO;
import com.mallika.servlet1.NewVersionDAO;


public class DAOUtility {
	public static IUserDAO getNewVersionDAO(){
		return new NewVersionDAO();
		
	}

}
