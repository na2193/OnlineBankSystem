package com.gmail.nasimahmed28.database;

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

	/*
	 * we cannot instantiate this class
	 */
	private DBConnection()
	{

	}

	public static Connection getConnection()
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

		return conn;
	}

}