package com.gmail.nasimahmed28.model;

public class UserProfile 
{
	private String email, firstName, lastName, middleName, address, DOB, password, gender, maritalStatus, jobddress,
			createOn, updatedOn;
	private int contactNum;
	
	public UserProfile()
	{
		
	}
	
	public UserProfile(String email, String firstName, String lastName,
			String middleName, String address, String dOB, String password,
			String gender, String maritalStatus, String jobddress,
			String createOn, String updatedOn, int contactNum) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.address = address;
		DOB = dOB;
		this.password = password;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.jobddress = jobddress;
		this.createOn = createOn;
		this.updatedOn = updatedOn;
		this.contactNum = contactNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getJobddress() {
		return jobddress;
	}
	public void setJobddress(String jobddress) {
		this.jobddress = jobddress;
	}
	public String getCreateOn() {
		return createOn;
	}
	public void setCreateOn(String createOn) {
		this.createOn = createOn;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	public int getContactNum() {
		return contactNum;
	}
	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
}
