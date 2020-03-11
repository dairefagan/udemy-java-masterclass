package com.dairefagan;

public class Main {

  public static void main(String[] args) {

    // Build the object based on class already created
    // Think of it like:
    // Integer x = new Integer(10);

    Integer x = new Integer(10);

    // int x = 10;

    // We use the keyword new to initialise properly, without the object would be empty

    Car volkswagen = new Car();
    Car audi = new Car();

    // If run before setModel, observe the output is null:

    System.out.println("Model is " + volkswagen.getModel());

    // Set object model state:

    volkswagen.setModel("Golf");

    System.out.println("Model is " + volkswagen.getModel());

  }

}
