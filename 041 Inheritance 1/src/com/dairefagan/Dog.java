package com.dairefagan;

// The extends keyword triggers inheritance of fields and methods:

public class Dog extends Animal {

	// Inherit base fields from Animal super class:
	
//	public Dog(String name, int brain, int body, int size, int weight) {
//		super(name, brain, body, size, weight);
//	}
	
	// Unique fields for the Dog class:
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	// Inherit base fields from Animal super class but also add new ones.
	// As all dogs have a brain and a body, we can leave out the arguments:

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
	
		super(name, 1, 1, size, weight); // 1, 1, = brain, body.
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew() {
		System.out.println("Dog.chew() called.");
	}

	//Override methods are used instead of the method in the superclass.
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called.");
		chew();
		super.eat(); // Calls method from superclass.
	}

	
	
}
