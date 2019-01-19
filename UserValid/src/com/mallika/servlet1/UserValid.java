package com.mallika.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mallika.uttil.DAOUtility;

/**
 * Servlet implementation class UserValid
 */
@WebServlet("/Log")
public class UserValid extends HttpServlet {
	

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/Admin");
		String userName=request.getParameter("n1");
		String passWord=request.getParameter("p1");
		String userType=getUserType(userName,passWord);
	     try{
		   if(userType.equals("admin")){
			   rd.forward(request, response);
		   }
		   else{
			   pw.println("Invalid user");
		   }
	
	     }
	     catch(InvalidUserException e){
	    	 pw.println(e.getMessage());
	     }
	}
public String getUserType(String userName,String passWord){
	IUserDAO dao=DAOUtility.getNewVersionDAO();
	return dao.getUSerType(userName, passWord);
	
}
}
