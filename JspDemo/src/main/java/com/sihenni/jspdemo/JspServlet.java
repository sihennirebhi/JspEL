package com.sihenni.jspdemo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/JspServlet")
public class JspServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//JSP implementation
		
		List  <Student> studs = Arrays.asList(new Student(1,"Mohamed")
				, new Student(2,"Omar"), new Student(3,"Ali"));
		
		//String name = "Si Henni";
		
		//Student s = new Student(1, "Mohamed");
		
		
		request.setAttribute("Students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
		rd.forward(request, response);
		
		
	}

	
}
