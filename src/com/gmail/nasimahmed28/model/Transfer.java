package com.gmail.nasimahmed28.model;

public class Transfer
{
	 private int transactionID, srcAccountID, destAccountID;
	 private double amount;
	 private String transactionDate, memo;
	 
	 public Transfer()
	 {
		 
	 }

	public Transfer(int transactionID, int srcAccountID, int destAccountID,
			double amount, String transactionDate, String memo) {
		super();
		this.transactionID = transactionID;
		this.srcAccountID = srcAccountID;
		this.destAccountID = destAccountID;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.memo = memo;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getSrcAccountID() {
		return srcAccountID;
	}

	public void setSrcAccountID(int srcAccountID) {
		this.srcAccountID = srcAccountID;
	}

	public int getDestAccountID() {
		return destAccountID;
	}

	public void setDestAccountID(int destAccountID) {
		this.destAccountID = destAccountID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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
}
