package com.dairefagan;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Labrador", 8, 20, 2, 4, 1, 20, "Medium");
		
		System.out.println("\n*******************************************************\n");
		
		dog.eat();
		
		System.out.println("\n*******************************************************\n");
		
		dog.walk();
		
		System.out.println("\n*******************************************************\n");
		
		dog.run();
		
		System.out.println("\n*******************************************************\n");
		
		Fish fish = new Fish("Salmon", 2, 2, 1, 1, 1);
		
		fish.swim(11);
		
	}

}
