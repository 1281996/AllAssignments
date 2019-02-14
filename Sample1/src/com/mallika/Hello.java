package com.mallika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String s1=request.getParameter("n1");
		
	pw.print(s1);
		pw.print("<h1>hello mallika l</h1>");
	}

	
}
