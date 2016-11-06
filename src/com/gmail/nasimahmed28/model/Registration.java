package com.gmail.nasimahmed28.model;

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
	public void setCraeteOn(String craeteOn) {
		this.craeteOn = craeteOn;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}	
}
