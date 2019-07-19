// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of Eclipse as setters wont be needed
// test and confirm it works.

package com.dairefagan;

public class Main {

	public static void main(String[] args) {
		
		VIPCustomer emptyAccount = new VIPCustomer();
		
		System.out.println("\n******************************************************\n");
		
		System.out.println("The account name is : " + emptyAccount.getCustomerName() + ".");
		System.out.println("The account balance is : €" + emptyAccount.getCreditLimit()  + ".");
		System.out.println("The account name is : " + emptyAccount.getCustomerEmail() + ".");
		
		VIPCustomer elonsAccount = new VIPCustomer("Elon Musk", 100_000_000);
		
		System.out.println("\n******************************************************\n");
		
		System.out.println("The account name is : " + elonsAccount.getCustomerName() + ".");
		System.out.println("The account balance is : €" + elonsAccount.getCreditLimit()  + ".");
		System.out.println("The account name is : " + elonsAccount.getCustomerEmail() + "."); 
		
		System.out.println("\n******************************************************\n");
		
		VIPCustomer marksAccount = new VIPCustomer("Mark Zuckerberg", 150_000_000, "mark@facebook.com");
		
		System.out.println("The account name is : " + marksAccount.getCustomerName() + ".");
		System.out.println("The account balance is : €" + marksAccount.getCreditLimit()  + ".");
		System.out.println("The account name is : " + marksAccount.getCustomerEmail() + "."); 
		
	}

}
