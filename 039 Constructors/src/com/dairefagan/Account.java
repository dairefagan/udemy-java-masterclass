package com.dairefagan;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1.  To allow the customer to deposit funds (this should increment the balance field).
// 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
		this("00000000", 0.00, "Default name", "Default email address", "Default phone number");
		
		System.out.println("Using default constructor");
		
	}
	
	public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		
		System.out.println("Using constructor with arguments:");

		// Better practice to assign values directly to fields, rather than calling setters,
		// as this cause issues with inheritance, or setters may not yet be initialised.
		
		
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerEmailAddress(String email) {
		this.customerEmailAddress = email;
	}
	
	public String getCustomerEmailAddress() {
		return this.customerEmailAddress;
	}

	public void setCustomerPhoneNumber(String phone) {
		this.customerPhoneNumber = phone;
	}
	
	public String getCustomerPhoneNumberString() {
		return this.customerPhoneNumber;
	}
	
	public void deposit(double depositamountmount) {
		this.balance += depositamountmount;
		System.out.println(depositamountmount + " has been deposited to your account.");
		System.out.println("The account balance is : €" + getBalance() + ".");
	}
	
	public void withdraw(double withdrawlAmount) {
		
		if (withdrawlAmount <= this.balance) {
			this.balance -= withdrawlAmount;
			System.out.println(withdrawlAmount + " has been withdrawn from your account.");
			System.out.println("The account balance is : €" + getBalance() + ".");
		} else {
			System.out.println("Insufficent funds available to withdraw €" + withdrawlAmount + ".");
			System.out.println("The account balance is : €" + getBalance() + ".");
		}
		
	}
	
	
}
