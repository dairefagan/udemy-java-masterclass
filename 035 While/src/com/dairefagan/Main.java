package com.dairefagan;

public class Main {

  public static void main(String[] args) {

    // While loops run until expression evaluates to false.
    // We use them when we do not know how many times we want to loop

    int count = 1;

    while (count != 6) {
      System.out.println("While count value is " + count);
      count++;
    }

//		for(int i=1; i<6; i++) {
//			System.out.println("For count value is " + i);
//		}

    count = 1;

    while (true) {
      if (count == 6) {
        break;
      }
      System.out.println("While(true) count value is " + count);
      count++;
    }

    count = 1;

    // DoWhile loops will always execute at least once:

    do {
      System.out.println("DoWhile Count value was " + count);
      count++;
    } while (count != 6);

    // Challenge 1:

    int number = 5;
    int endNumber = 20;

    while (number <= endNumber) {
      if (!isEvenNumber(number)) {
        number++;
        // Stop and restarts loop:
        continue;
      }

      System.out.println(number + " is an even number.");
      number++;

    }

    // Challenge 2 (My way):

    number = 5;
    endNumber = 20;
    int evenNumbersFound = 0;

    while ((number <= endNumber) && (evenNumbersFound != 5)) {
      if (!isEvenNumber(number)) {
        number++;
        continue;
      }

      System.out.println(number + " is an even number.");
      number++;
      evenNumbersFound++;
    }

    System.out.println(evenNumbersFound + " even numbers have been found.");

    // Challenge 2 (Tim's way):

    number = 5;
    endNumber = 20;
    evenNumbersFound = 0;

    while (number <= endNumber) {
      if (!isEvenNumber(number)) {
        number++;
        continue;
      }

      System.out.println(number + " is an even number.");
      number++;

      evenNumbersFound++;
      if (evenNumbersFound >= 5) {
        break;
      }

    }

    System.out.println(evenNumbersFound + " even numbers have been found.");


  }

  public static boolean isEvenNumber(int number) {

    if (number % 2 == 0) {

      return true;
    } else {
      return false;
    }

  }

}
		

