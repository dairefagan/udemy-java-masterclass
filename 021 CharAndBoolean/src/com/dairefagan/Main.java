package com.dairefagan;

public class Main {

	public static void main(String[] args) {

		// Chars have a width of 16 bits, 2 bytes
		char myRegisteredChar = '\u00AE';
		System.out.println("Unicode output 1 was: " + myRegisteredChar);
		
		boolean myBoolean = false;
		boolean isMale = true;
		
		char myCopyrightChar = '\u00A9';
		System.out.println("Unicode output 2 was: " + myCopyrightChar);
		
	}

}
