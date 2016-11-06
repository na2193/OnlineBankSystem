package com.gmail.nasimahmed28.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Registration 
{
	private int id;
	private String firstName, lastName, email, token;
	private String craeteOn, updatedOn;

	public Registration()
	{
		
	}
	
	public Registration(int id, String firstName, String lastName,
			String email, String token, String craeteOn, String updatedOn) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.token = token;
		this.craeteOn = craeteOn;
		this.updatedOn = updatedOn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCraeteOn() {
		return craeteOn;
	}
	
	public String getUpdatedOn() {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		String date = d.getYear() + "-" + d.getMonth() + "-" + d.getDay() + " " + d.getHours() 
					+ ":" + d.getMinutes() + ":" + d.getSeconds();
			
		return date;
	}
	
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}	
	
	public void setToken(int length) 
	{
		String token = "";
		Random random = new Random();
		
		for(int i = 0; i < length; i++)
		{
			token += "" + random.nextInt(10);	
		}
		
		this.token = token;
	}
	
}
