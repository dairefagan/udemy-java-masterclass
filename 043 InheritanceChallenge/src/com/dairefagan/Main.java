package com.dairefagan;

public class Main {

	public static void main(String[] args) {

		Vehicle emptyVehicle = new Vehicle();
		emptyVehicle.printDetails();
		
		System.out.println("***************************************************************");
		
		Vehicle unicycle = new Vehicle(1, 1, "black");
		unicycle.printDetails();
		
		System.out.println("***************************************************************");
		
		unicycle.move(2);
		
		System.out.println("***************************************************************");
		
		Car audiA4 = new Car(4, 4, "metallic", "Audi", "A4", "petrol", "manual", true, true);
		audiA4.printDetails();
		
		System.out.println("***************************************************************");
		
		audiA4.drive(10);
		
		System.out.println("***************************************************************");
		
		audiA4.turn("left");
		
		audiA4.turn("neutral");
		
		audiA4.turn("right");
		
		System.out.println("***************************************************************");
		
		audiA4.changeGear(1);
		audiA4.changeGear(2);
		audiA4.changeGear(3);
		audiA4.changeGear(4);
		audiA4.changeGear(5);
		
		System.out.println("***************************************************************");
		
		PerformanceCar audiA4KA = new PerformanceCar(4, 2, "red", "Audi", "A4", "Kenneth Alm", "Petrol", "Manual", true, true, true);
		
		audiA4KA.printDetails();
		
		System.out.println("***************************************************************");
		
		audiA4KA.drift(110);
		
		System.out.println("***************************************************************");
		
	}

}
