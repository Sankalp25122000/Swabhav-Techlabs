package com.aurionpro.model;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Account acc;
	private double amount;

	public InsufficientFundsException(Account acc, double amount) {
		this.acc = acc;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		String message = "";
		message += "Cannot withdraw amount :Rs. " + amount;
		message += "\nAccount :" + acc.getAccountNumber();
		message += "\nCurrent Balance :" + acc.getBalance();
		message += "\nMinimum Balance is Rs 1000";
		return message;

	}

}
