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

	public void walk() {
		System.out.println("Dog.walk() called");
		
		// Better to use move() without super.move() in case move is overridden.
		// Without super, defaults to superclass, unless override exists.
		   
		move(5);
	}
	

	
	public void run() {
		System.out.println("Dog.run() called.");
		
		// Using super.move() reverts to the superclass, even though a move() override
		// exists:
		
		super.move(10);
	}

	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called.");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called.");
		moveLegs(speed);
		super.move(speed);
	}
	
}
