package com.gmail.nasimahmed28.main;

import java.util.Properties;

import javax.websocket.Session;

public class EmailSender 
{	
	public void sendMail(String email)
	{
		String to = email;
		String from = "ahmednasim28@gmail.com";
		String host = "localhost";
		
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
	//	Session session = Session.getDefaultInstance(properties);
	}
}
