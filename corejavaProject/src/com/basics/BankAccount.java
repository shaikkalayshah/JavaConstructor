package com.basics;

public class BankAccount {
	
	void displayAccount() {
		System.out.println("Account Number : 1234567");
		System.out.println("Account Holder Name : Shaik Kalayshah");
		System.out.println("Account type : Saving");
		System.out.println("Balance : 435.00");

	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.displayAccount();

	}

}
