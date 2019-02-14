package com.mallika.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mallika.servlet.InvalidException;


@WebServlet("/login")
public class ValidateUser extends HttpServlet {
	
   
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/Admin");
		RequestDispatcher rd1=request.getRequestDispatcher("/User");
		String userType="invalid";
		//pw.print("hello");
		String userName=request.getParameter("user");
		String passWord=request.getParameter("pass");
	try{userType=getUserType(userName,passWord);
	
		if(userType.equals("Admin")){
			
			rd.forward(request, response);
		}
		else if(userType.equals("User")){
			rd1.forward(request, response);
		}
		else{
			pw.println("invlid user");
		}
	}	
		catch(InvalidException e){
			 pw.println(e.getMessage());
		}
	}
public String getUserType(String userName,String passWord) 
{
	
	UserDAO dao=new UserDAO();
	//System.out.println(userName+""+passWord);
	
	
	return dao.getUserType(userName, passWord);
}
}
