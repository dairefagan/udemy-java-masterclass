package com.dairefagan;

public class Main {

  public static void main(String[] args) {

//		int value = 3;
//		if (value == 1) {
//			System.out.println("Value was 1.");	
//		} else if (value == 2) {
//			System.out.println("Value was 2.");
//		} else {
//			System.out.println("Value was not 1 or 2.");
//		}

    // Switches can only be used for testing a single variable, unlike if.
    // We can use primitive data types: byte, short, char, and int.

    int switchValue = 6;

    switch (switchValue) {

      case 1:
        System.out.println("Value was 1.");
        break;

      case 2:
        System.out.println("Value was 2.");
        break;

      case 3:
      case 4:
      case 5:
        System.out.println("Value was 3, 4, or 5.");
        System.out.println("Value was in fact " + switchValue + ".");
        break;

      default:
        System.out.println("Value was not 1, 2, 3, 4, or 5.");

        // Technically final break is unnecessary, but left for convention:

        break;
    }

    // Challenge:

    char switchChar = 'E';

    switch (switchChar) {

      case 'A':
        System.out.println("Character was A.");
        break;

      case 'B':
        System.out.println("Character was B.");
        break;

//		case 'C':
//			System.out.println("Character was C.");
//			break;
//		
//		case 'D':
//			System.out.println("Character was D.");
//			break;
//		
//		case 'E':
//			System.out.println("Character was E.");
//			break;

      case 'C':
      case 'D':
      case 'E':
        System.out.println("Character was " + switchChar + ".");
        break;

      default:
        System.out.println("The character was not found.");
        break;
    }

    // End of challenge.

    String month = "jAnUaRy";

    // Using method of String class to convert toLowerCase/toUpperCase:

    switch (month.toLowerCase()) {

      case "january":
        System.out.println("Jan");
        break;

      case "march":
        System.out.println("Mar");
        break;

      default:
        System.out.println("Month not found.");
        break;

    }

  }

}
