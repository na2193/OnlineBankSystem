package com.gmail.nasimahmed28.model;

public class Account 
{
	private int accountID, emailID, accountTypeID;
	private String openDate, closeDate, Status;
	
	public Account()
	{
		
	}
	
	public Account(int accountID, int emailID, int accountTypeID,
			String openDate, String closeDate, String status) {
		super();
		this.accountID = accountID;
		this.emailID = emailID;
		this.accountTypeID = accountTypeID;
		this.openDate = openDate;
		this.closeDate = closeDate;
		Status = status;
	}



	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getEmailID() {
		return emailID;
	}

	public void setEmailID(int emailID) {
		this.emailID = emailID;
	}

	public int getAccountTypeID() {
		return accountTypeID;
	}

	public void setAccountTypeID(int accountTypeID) {
		this.accountTypeID = accountTypeID;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
