package com.gmail.nasimahmed28.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class DBConnection 
{
	private static String url = "jdbc:mysql://localhost:3306/OnlineBankSystem";
	private static String username = "root";
	private static String password = "Nasim8055";

	private static Connection conn;
	private static PreparedStatement stmt;

	private static void connectToDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			DBConnection.conn = DriverManager.getConnection(DBConnection.url, DBConnection.username, DBConnection.password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static boolean validateLogin(String username, String password) throws Exception
	{
		boolean valid = false;

		DBConnection.connectToDB();

		String query = "SELECT * FROM ";

		stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();

		String dbUsername = "", dbPassword = "";

		while(rs.next())
		{
			dbUsername = rs.getString("email");
			dbPassword = rs.getString("password");
		}

		if(username.equals(dbUsername) && password.equals(dbPassword))
			valid = true;
		else
			valid = false;

		return valid;
	}

}