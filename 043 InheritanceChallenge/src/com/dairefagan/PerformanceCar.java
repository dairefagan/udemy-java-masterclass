package com.dairefagan;

public class PerformanceCar extends Car {

  private boolean allWheelDrive;
  private String specialEdition;

  public PerformanceCar(int wheels, int numberOfSeats, String colour, String manufacturer,
      String model, String specialEdition,
      String engineType, String transmissionType, boolean allWheelDrive, boolean ABS,
      boolean airConditioning) {

    super(wheels, numberOfSeats, colour, manufacturer, model, engineType, transmissionType, ABS,
        airConditioning);

    this.allWheelDrive = allWheelDrive;
    this.specialEdition = specialEdition;

  }

  public void drift(int speed) {
    System.out.println(
        "PerformanceCar.drift called." + " The " + manufacturer + " " + model + " " + specialEdition
            + " edition is drifting.");
    drive(speed);
  }

  @Override
  public void printDetails() {
    super.printDetails();

    if (allWheelDrive) {
      System.out
          .println("The " + manufacturer + " " + model + specialEdition + " edition has AWD.");
    } else {
      System.out.println(
          "The " + manufacturer + " " + model + specialEdition + " edition does not have AWD.");
    }


  }

  public boolean getAllWheelDrive() {
    return allWheelDrive;
  }

  public String getSpecialEdition() {
    return specialEdition;
  }

}
