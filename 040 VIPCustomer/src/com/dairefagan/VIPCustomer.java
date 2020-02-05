// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of Eclipse as setters wont be needed
// test and confirm it works.

package com.dairefagan;

public class VIPCustomer {

	private String customerName;
	private double creditLimit;
	private String customerEmail;
	
	public VIPCustomer() {
		
		// The this keyword in constructors calls the constructor again, 
		// and as such, relies upon a corresponding constructor existing.
		
		this("Default name", 0.00, "default@email.com");
		
		System.out.println("Default constructor called.");
		
	}
	
	public VIPCustomer(String customerName, double creditLimit) {
		this(customerName,creditLimit, "default@email.com");
		
		System.out.println("\nConstructor with two arguments called.");
		
	}

	public VIPCustomer(String customerName, double creditLimit, String customerEmail) {
		
		System.out.println("Constructor with three arguments called.\n");
		
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.customerEmail = customerEmail;
		
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public boolean equals(Object o) {
		if (o == null || !(o instanceof VIPCustomer)) {
			return false;	
		}
		
		VIPCustomer vc = (VIPCustomer) o;
		return customerEmail == vc.customerEmail && customerName == vc.customerName;
	}

}
