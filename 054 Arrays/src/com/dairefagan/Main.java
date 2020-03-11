package com.dairefagan;

public class Main {

  public static void main(String[] args) {

//		Ways to initialise arrays

    int[] myIntArray = new int[25];

//		int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

//		myIntArray[5] = 50;	
//		double[] myDoubleArray = new double[10];
//		System.out.println(myIntArray[5]);
//		
//		System.out.println(myIntArray[0]);
//		System.out.println(myIntArray[6]);
//		System.out.println(myIntArray[8]);

//		for(int i=0; i<10; i++) {
//		myIntArray[i] = i*10;
//		}
//	
//		for(int i=0; i<10; i++) {
//		System.out.println("Element " + i + ", value is " + myIntArray[i]);
//		}

    for (int i = 0; i < myIntArray.length; i++) {
      myIntArray[i] = i * 10;
    }

    printArray(myIntArray);

//		System.out.println(myIntArray.length);
//	
//		for(int i=0; i<myIntArray.length; i++) {
//		System.out.println("Element " + i + ", value is " + myIntArray[i]);
//		}

  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + ", value is " + array[i]);
    }


  }

}
