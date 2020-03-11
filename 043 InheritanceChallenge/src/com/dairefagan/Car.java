package com.dairefagan;

public class Car extends Vehicle {

  protected String manufacturer;
  protected String model;
  private String engineType;
  private String transmissionType;
  private Boolean ABS;
  private Boolean airConditioning;
  private int gear;
  private String steering;

  public Car(int wheels, int numberOfSeats, String colour, String manufacturer, String model,
      String engineType, String transmissionType, Boolean ABS,
      Boolean airConditioning) {

    super(wheels, numberOfSeats, colour);

    this.manufacturer = manufacturer;
    this.model = model;
    this.engineType = engineType;
    this.transmissionType = transmissionType;
    this.ABS = ABS;
    this.airConditioning = airConditioning;
    this.gear = 0;
    this.steering = "neutral";
  }

  public void drive(int speed) {

    System.out.println("Car.drive() called. The " + manufacturer + " " + model + " is driving.");
    move(speed);

  }

  @Override
  public void printDetails() {
    System.out.println("Car.printDetails called.");
    super.printDetails();
    System.out.println("The car manufacturer is " + manufacturer + ".");
    System.out.println("The car model is " + model + ".");
    System.out.println("The " + manufacturer + " " + model + " engine type is " + engineType + ".");
    System.out.println(
        "The " + manufacturer + " " + model + " transmission type is " + transmissionType + ".");

    if (ABS) {
      System.out.println("The " + manufacturer + " " + model + " has ABS.");
    } else {
      System.out.println("The " + manufacturer + " " + model + " does not have ABS.");
    }

    if (airConditioning) {
      System.out.println("The " + manufacturer + " " + model + " has air conditioning.");
    } else {
      System.out.println("The " + manufacturer + " " + model + " does not have air conditioning.");
    }

    System.out.println(
        "The " + manufacturer + " " + model + " currently has gear " + gear + " selected.");
    System.out
        .println("The " + manufacturer + " " + model + " is currently steering " + steering + ".");
  }

  public void turn(String direction) {
    System.out.println("Car.turn called.");
    this.steering = direction;
    System.out
        .println("The " + manufacturer + " " + model + " is currently steering " + steering + ".");
  }

  public void changeGear(int newGear) {
    System.out.println("Car.changeGear called.");
    this.gear = newGear;
    System.out
        .println("The " + manufacturer + " " + model + " now has gear " + gear + " selected.");

  }

  public String getEngineType() {
    return engineType;
  }

  public String getTransmissionType() {
    return transmissionType;
  }

  public boolean getABS() {
    return ABS;
  }

  public boolean getAirConditioning() {
    return airConditioning;
  }

  public int getGear() {
    return gear;
  }

  public String getSteering() {
    return steering;
  }
}
