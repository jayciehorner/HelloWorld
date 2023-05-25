package com.skillstorm.training.week08.day4;

public class EnumExamples {
enum Meal{
		BREAKFAST, 
		SECOND_BREAKFAST,
		ELEVENSIES,
		LUNCH, 
		DINNER, 
		MIDNIGHT_CHOW
		
}
public static void main(String [] args) {
	System.out.println(Meal.BREAKFAST);
	for(Meal m : Meal.values()) {
		System.out.println(m.ordinal() + " " + m);
	}
	// System.out.println(Meal.BREAKFAST == 1); // cant assign Enum to int or string or anything else
	System.out.println(Meal.BREAKFAST == Meal.valueOf("bREAKFASt".toUpperCase())); // only way to appropriately do above // Case sensitive
	System.out.println(Meal.BREAKFAST.ordinal() == 1); 
}
}
