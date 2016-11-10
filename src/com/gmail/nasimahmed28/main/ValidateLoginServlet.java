package com.gmail.nasimahmed28.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gmail.nasimahmed28.database.RegistrationService;

@WebServlet("/ValidateLoginServlet")
public class ValidateLoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
				
		try
		{
			boolean validLogin = RegistrationService.validateLogin(username, password);
			
			if(validLogin)
			{
				session = request.getSession();
				session.setAttribute("email", username);
				RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard-page.jsp");
				dispatcher.forward(request, response);	
			}
			else
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("login-page.jsp");
				dispatcher.forward(request, response);	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
