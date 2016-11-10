package com.gmail.nasimahmed28.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gmail.nasimahmed28.database.UserProfileService;
import com.gmail.nasimahmed28.model.UserProfile;

@WebServlet("/UserProfileServlet")
public class UserProfileServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = "";
		
		HttpSession session = request.getSession();
		if(session != null)
		{
			email = (String) session.getAttribute("username");
			UserProfile profile = new UserProfile();
			profile = UserProfileService.getBasicUserProfile(email);	
			
			request.setAttribute("firstname", profile.getFirstName());
			request.setAttribute("lastname", profile.getLastName());
		}
		
		UserProfile profile = new UserProfile();
		
		profile.setFirstName(request.getParameter("firstname"));
		profile.setLastName(request.getParameter("lastname"));
		profile.setAddress(request.getParameter("address"));
		profile.setDOB(request.getParameter("dob"));
		profile.setGender(request.getParameter("gender"));
		profile.setContactNum(Integer.parseInt(request.getParameter("contactNum")));
		profile.setMaritalStatus(request.getParameter("maritalStatus"));
		profile.setJobddress(request.getParameter("jobAddress"));
		
		int executedValue = UserProfileService.saveUserProfile(profile);
		if(executedValue > 0)
		{
			
		}
		else
		{
			
		}
		
	}

}
