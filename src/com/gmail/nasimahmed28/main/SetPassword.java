package com.gmail.nasimahmed28.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gmail.nasimahmed28.database.RegistrationService;

@WebServlet("/SetPassword")
public class SetPassword extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String token = request.getParameter("token"); 
		String password = request.getParameter("password");
		String verifyPassword = request.getParameter("verifyPassword");
		
		if(password.equals(verifyPassword))
		{
			if(RegistrationService.setPassword(token, password) > 0)
			{
				response.sendRedirect("register-success.jsp");
			}
			else
			{
				response.sendRedirect("register-failure.jsp");
			}
		}
		else
		{
			response.sendRedirect("set-password.jsp");
		}
	}

}
