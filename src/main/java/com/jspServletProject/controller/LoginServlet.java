package com.jspServletProject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspServletProject.model.Users;
import com.jspServletProject.services.UserServices;
import com.jspServletProject.services.UserServicesImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserServices uservice = new UserServicesImpl();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String loginName = request.getParameter("un");
		String password = request.getParameter("ps");

		try {
			Users user = uservice.authenticate(loginName, password);
			
			if (user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("name", user.getName());
				response.sendRedirect("index.jsp");
			} else {
				out.println("<h4 style='color:red;'>Sorry, Username or Password Incorrect</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
