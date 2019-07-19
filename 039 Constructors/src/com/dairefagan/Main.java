package com.dairefagan;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n******************************************************\n");
		
		Account current = new Account();
		
		System.out.println("The account number is : " + current.getNumber() + ".");
		System.out.println("The account balance is : €" + current.getBalance() + ".");
		System.out.println("The account name is : " + current.getCustomerName() + ".");
		System.out.println("The account email is : " + current.getCustomerEmailAddress() + ".");
		System.out.println("The account phone number is : " + current.getCustomerPhoneNumberString() + ".");
		
		System.out.println("\n******************************************************\n");
		
		Account savings = new Account("87654321", 100_000, "Dáire Fagan", "daire@java.com", "0877654321");
		
		System.out.println("The account number is : " + savings.getNumber() + ".");
		System.out.println("The account balance is : €" + savings.getBalance() + ".");
		System.out.println("The account name is : " + savings.getCustomerName() + ".");
		System.out.println("The account email is : " + savings.getCustomerEmailAddress() + ".");
		System.out.println("The account phone number is : " + savings.getCustomerPhoneNumberString() + ".");
		
		System.out.println("\n******************************************************\n");
		
		System.out.println("Manually setting values:");
		
		savings.setNumber("12345678");
		savings.setBalance(10_000);
		savings.setCustomerName("Dáire Fagan");
		savings.setCustomerEmailAddress("daire@java.com");
		savings.setCustomerPhoneNumber("0871234567");
		
		System.out.println("The account number is : " + savings.getNumber() + ".");
		System.out.println("The account balance is : €" + savings.getBalance() + ".");
		System.out.println("The account name is : " + savings.getCustomerName() + ".");
		System.out.println("The account email is : " + savings.getCustomerEmailAddress() + ".");
		System.out.println("The account phone number is : " + savings.getCustomerPhoneNumberString() + ".");
		
		System.out.println("\n******************************************************\n");
		
		savings.deposit(5_000);
		savings.withdraw(2_500);
		savings.withdraw(20_000);
		
	}

}
