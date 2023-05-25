package com.skillstorm.training.week01.day2;

public class CatAdoption {
	public static void main(String[] args) {
		/*
		 * CHALLENGE: Use all the primitive data types
		 * 
		 * Number
		 *   byte
		 *   short
		 *   int
		 *   long
		 *   float
		 *   double
		 * 
		 * Character
		 *   char
		 *   
		 * Boolean
		 *   boolean
		 */
		String name = "Fluffy";
		byte age = 1;
		String ageUnit = "years";
		short daysAvailableForAdoption = 365;
		int cansOfCatFoodPerYear = 365 * 2; // * is multiplication (not x)
		long amountOfLove = 3000000000000L; // larger than 2 billion
		float cost = 49.99f; // 7 digits of precision
		double weight = 8.123456789; // in pounds 
		String weightUnits = "pounds";
		char gender = 'F'; // "F" is a String even though it's only one character
		boolean crazy = false; // we will go over how to use this in logic statements
		boolean vaccinated = true;
		boolean availableForAdoption = true;
		
		System.out.println(); // CTRL-ALT-DOWNARROW to copy this line below
		System.out.println("name: " + name);
		System.out.println("age: " + age + " " + ageUnit);
		System.out.println("gender: " + gender);
		System.out.println("vaccinated: " + vaccinated); // DO NOT HARDCODE true here
		System.out.println("weight: " + weight + " " + weightUnits);
		System.out.println("Available: " + availableForAdoption + " for $" + cost);
		System.out.println("\t" + daysAvailableForAdoption + " day available so far"); // CTRL-SPACE will auto-complete your variable name
		System.out.print("About: " + name + " is crazy " + crazy + ". ");
		System.out.print("You will need " + cansOfCatFoodPerYear + " cans of cat food per year. ");
		System.out.print(" Your kitty will love you " + amountOfLove + "x over.");
		System.out.println();
		
	}

}
