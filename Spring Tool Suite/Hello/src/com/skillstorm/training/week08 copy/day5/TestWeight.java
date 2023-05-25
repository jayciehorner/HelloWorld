package com.skillstorm.training.week08.day5;

public class TestWeight {
public static void main(String [] args) {
	Person p = new Person ("Sam", 150);
	System.out.println(p);
	// Get all the planets and loop through them
	for (Planet planet : Planet.values()) {
		System.out.println("On " + planet + " Sam weight " + p.getWeight(planet) + " lbs");
	}
	// Useful enum methods to remmeber:
	/*
	 * .values() -- gives me an array
	 * .ordinal() -- the number position the enum value was defined in
	 * 
	 * .valueOf(String) -- turns a String into the cooresponding enum
	 */
}
}
