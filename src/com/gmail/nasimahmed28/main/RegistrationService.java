package com.gmail.nasimahmed28.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gmail.nasimahmed28.model.Registration;

public class RegistrationService 
{
	public static int saveToRegistration(Registration register)
	{
		int executeValue = 0;
		try
		{
		Connection conn = DBConnection.getConnection();
		
		String query = "INSERT INTO Registration (firstName, lastName, email, token) "
				+ "VALUES (?, ?, ?, ?)";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, register.getFirstName());
		stmt.setString(2, register.getLastName());
		stmt.setString(3, register.getEmail());
		stmt.setString(4, register.getToken());
		
		executeValue = stmt.executeUpdate();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return executeValue;
	}
	
	private static boolean checkToken(String token)
	{
		int c = 0;
		try
		{
			Connection conn = DBConnection.getConnection();
			
			String query = "SELECT id FROM Registration WHERE token = '"+token+"' ";
			
			PreparedStatement stmt = conn.prepareStatement(query);
			//Statement stmt = conn.createStatement();
			//stmt.setString(1, token);
			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				c = rs.getInt("id");
				break;
			}		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(c);
		if(c > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int validateUser(String token)
	{
		int updatedQueryValue = 0;
		System.out.println(token);
		
		if(RegistrationService.checkToken(token))
		{
			try
			{
			Connection conn = DBConnection.getConnection();
			String updateQuery = "UPDATE Registration set status = 1 where token =?";
			PreparedStatement stmt = conn.prepareStatement(updateQuery);
			stmt.setString(1, token);
			
			System.out.println(stmt.toString());
			
			updatedQueryValue = stmt.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(updatedQueryValue);
		return updatedQueryValue;
	}
}
