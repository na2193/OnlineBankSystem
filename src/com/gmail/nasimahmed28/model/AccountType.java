package com.gmail.nasimahmed28.model;

public class AccountType 
{
	private int accountTypeID;
	private String accountType;
	private double minBalance;
	
	public AccountType()
	{
		
	}

	public AccountType(int accountTypeID, String accountType, double minBalance) {
		super();
		this.accountTypeID = accountTypeID;
		this.accountType = accountType;
		this.minBalance = minBalance;
	}

	public int getAccountTypeID() {
		return accountTypeID;
	}

	public void setAccountTypeID(int accountTypeID) {
		this.accountTypeID = accountTypeID;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
}
