package com.mallika.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.malika.serv.DAO;

/**
 * Servlet implementation class Valid2
 */
@WebServlet("/form2")
public class Valid2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String userName1=request.getParameter("t1");
	String passWord1=request.getParameter("t2");
	//pw.println(passWord1);
	String status=validUser(userName1,passWord1);
	if(status.equals("valid")){
		pw.println("valid credentails");
	}
	}
public String validUser(String userName1,String passWord1){
	DAO dao=new DAO();
	//System.out.println("mallika prasad");
	return dao.validUser(userName1,passWord1);
}
}
