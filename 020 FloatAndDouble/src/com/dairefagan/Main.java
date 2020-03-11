package com.dairefagan;

public class Main {

  public static void main(String[] args) {
	
/*
		
		// Width of int = 32  (4 bytes)
		
		int myIntValue = 5 / 3;
		
		// Java treats decimal numbers as doubles automatically, with add f to specify float value
		// Width of float = 32 (4 bytes)
		// 7 units of precision
		
		float myFloatValue = 5f / 3f;
		
		// Width of double = 64 (8 bytes)
		// 16 units of precision
		
		double myDoubleValue = 5d / 3d;
		
		// Challenge cast double as float
		
		float myCastFloatValue = (float) 5.4;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);

*/

    // Create variable to store the number of pounds
    // Calculate the number of kilograms for the number above and store in a variable
    // Print result

    double numPounds = 200d;

    double convertedKilograms = numPounds * 0.45359237d;

    System.out.println(numPounds + " pounds is converted to " + convertedKilograms + " kg.");

    // We can use underscore for doubles also

    double pi = 3.141_592_7d;
  }

}
