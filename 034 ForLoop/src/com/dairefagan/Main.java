package com.dairefagan;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0) + ".");
		System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0) + ".");
		System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0) + ".");
		System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0) + ".");
		
		// for(init; termination; increment)
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Loop iteration " + i + " is running.");
			
		}
		
		// Challenge 1:
		
		for(int i=2; i<9; i++) {
			
			// Java will automatically cast the integer as a double when passing to method:
			
			System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10_000.0, i));
			
			// If there were odd double values returned like 700.000001:
			// System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10_000.0, i)));

		}
		
		// End of challenge.
		
		// Challenge 2:
		
		System.out.println("*****************************");
		
		for(int i=8; i>1; i--) {
			
			System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10_000.0, i));
		
		}
		
		// End of challenge.
		
		// Challenge 3:
		
		int primeNumbersFound = 0;
		
		for(int i=10; i<=50; i++) {
			
			if (isPrime(i) == true) {
				System.out.println(i + " is prime.");
				primeNumbersFound ++;
				if (primeNumbersFound == 10) {
					System.out.println("Exiting loop.");
					break;
				}
			}
		}
		
		
		
	}

	public static double calculateInterest(double amount, double interestRate) {
		 
		return((amount/100) * interestRate);
		
	}
	
	// Method to check for prime number:
	
	public static boolean isPrime(int n) {
		
		if(n == 1) {
			return false;
		}
		
		// No number larger than n/2 will divide n:
		
		for(int i=2; i <= (long) Math.sqrt(n); i++) {

			// System.out.println("Looping.");
			
			// Check if any numbers divide n:
			
			if(n % i == 0) {
				return false;
			}
		}
	
		return true;
	}
	
	// Alternative, less efficient method, to check for prime number:
	
//	public static boolean isPrime(int n) {
//		
//		if(n == 1) {
//			return false;
//		}
//		
//		// No number larger than n/2 will divide n:
//		
//		for(int i=2; i <=n/2; i++) {
//
//			// Check if any numbers divide n:
//			
//			if(n % i == 0) {
//				return false;
//			}
//		}
//	
//		return true;
//	}
	
	
}
