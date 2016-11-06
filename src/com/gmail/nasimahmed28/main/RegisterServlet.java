package com.gmail.nasimahmed28.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gmail.nasimahmed28.model.Registration;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Registration register = new Registration();
		EmailSender sendEmail = new EmailSender();
		
		register.setFirstName(request.getParameter("firstname"));
		register.setLastName(request.getParameter("lastname"));
		register.setEmail(request.getParameter("email"));
		register.setToken(10);
		
		if (RegistrationService.saveToRegistration(register) > 0)
		{
			response.sendRedirect("register-success.jsp");
		}
		else
		{
			response.sendRedirect("register-failure.jsp");
		}
	}

}
