package com.dairefagan;

//Access Modifiers
//
//Public: unrestricted access
//Private: no other class can access
//Protected: classes in same package can access
//Can also leave out completely

//Template for new object:

public class Car {

	//Class/state/member variables or super data-types, most commonly referred to as fields.
	//Requires access modifier.
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		
		//Validating input:
		
		String validModel = model.toLowerCase();
		if(validModel.equals("golf") || validModel.equals("arteon")) {
			
			//this keyword selects class field:
			
			this.model = model;
		
		} else {
			this.model = "Unknown";
		}
		
	}
	
	public String getModel() {
		return this.model;
	}
}
