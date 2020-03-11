// Exercise:
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

package com.dairefagan;

public class Vehicle {

  private int wheels;
  private int numberOfSeats;
  private String colour;

  public Vehicle() {

  }

  public Vehicle(int wheels, int numberOfSeats, String colour) {
    this.wheels = wheels;
    this.numberOfSeats = numberOfSeats;
    this.colour = colour;
  }

  public void printDetails() {
    System.out.println("Vehicle.printDetails called.");
    System.out.println("The vehicle has " + wheels + " wheels.");
    System.out.println("The vehicle has " + numberOfSeats + " seats. ");
    System.out.println("The vehicle is colour " + colour + ".");

  }

  public int getWheels() {
    return wheels;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public String getColour() {
    return colour;
  }

  public void move(int speed) {

    System.out.println("Vehicle.move() called. Vehicle is moving at " + speed + " KMPH.");

  }


}

