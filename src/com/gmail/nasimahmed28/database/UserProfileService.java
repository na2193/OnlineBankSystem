package com.gmail.nasimahmed28.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gmail.nasimahmed28.model.UserProfile;

public class UserProfileService 
{
	public static UserProfile getBasicUserProfile(String email)
	{
		UserProfile profile = new UserProfile();
		
		try
		{
			Connection conn = DBConnection.getConnection();
			String query = "SELECT * FROM userProfile WHERE email = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				profile.setFirstName(rs.getString("firstName"));
				profile.setLastName(rs.getString("lastName"));				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return profile;
	}
	
	public static int saveUserProfile(UserProfile profile)
	{
		int executedValue = 0;
		
		try
		{
			Connection conn = DBConnection.getConnection();

			String query = "INSERT INTO Registration (firstName, lastName, address, dob,"
					+ "contactNumber, Gender, maritalStatus, jobAddress) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, profile.getFirstName());
			stmt.setString(2, profile.getLastName());
			stmt.setString(3, profile.getFirstName());
			stmt.setString(4, profile.getAddress());
			stmt.setString(5, profile.getDOB());
			stmt.setInt(6, profile.getContactNum());
			stmt.setString(7, profile.getGender());
			stmt.setString(8, profile.getMaritalStatus());
			stmt.setString(8, profile.getJobddress());
			
			executedValue = stmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return executedValue;
	}
}
