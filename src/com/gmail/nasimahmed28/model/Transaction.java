package com.gmail.nasimahmed28.model;

public class Transaction
{
	private int transactionID, accountID;
	private String transactionType, transactionDate, memo;
	private double amount;
	
	public Transaction()
	{
		
	}

	public Transaction(int transactionID, int accountID,
			String transactionType, String transactionDate, String memo,
			double amount) {
		super();
		this.transactionID = transactionID;
		this.accountID = accountID;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.memo = memo;
		this.amount = amount;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}


