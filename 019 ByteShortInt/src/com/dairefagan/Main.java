package com.dairefagan;

public class Main {

	public static void main(String[] args) {
		
		// We instantiate variables when we create them:
		
		int x;
		
		// We initialise or declare when we give variables a value:
		
		x = 10;
		
		// We assign when we change the value to something new:
		
		x = 11;

		// Longs have a width of 64
		// Longs range from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
		
//		long myLongValue = 100L;
		
		// Integers have a width of 32
		// Integers range from -2147483647 to 2147483648
		
		int myMinValue = -2_147_483_648;
		
//		int myMaxValue = 2_147_483_647;
		
		// No casting required for ints as expression are 
		// treated as ints automatically
		
		int myTotal = (myMinValue/2);
		
		System.out.println("myTotal = " + myTotal);
		
		// Shorts have a width of 16
		// Shorts range from -32768 to 32767
				
		short myShortValue = -32768;
		
		// Casting so the expression is treated as a short
		
		short myNewShortValue = (short) (myShortValue/2);
		System.out.println("myNewShortValue = " + myNewShortValue);
		
		// Bytes have a width of 8
		// Bytes go from -128 to 127
		
		byte myByteValue = -128;
		
		// Casting so the expression is treated as a byte, otherwise
		// treats expression in assignment as integer.
		
		byte myNewByteValue = (byte) (myByteValue/4);
		
		System.out.println("myNewByteValue = " + myNewByteValue);

/*
		// Challenge
		
		byte myByteValue = 10;
		
		short myShortValue = 20;
		
		int myIntValue = 50;
		
		// No casting required as long variables accept ints, which the expression is converted to automatically
		
		long myLongTotalValue = 50_000L + 10L * (myByteValue + myShortValue + myIntValue) ;

		System.out.println("myLongTotalalue, which is 50,000 + 10 times the sum of myByteValue, myShortValue, and myIntValue = " + myLongTotalValue);
		
		// Casting so the expression is treated as a short 
		short myShortTotalValue = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));
		
		System.out.println("myShortTotalValue, which is 1,000 + 10 times the sum of myByteValue, myShortValue, and myIntValue = " + myShortTotalValue);

*/
		
	}

}
