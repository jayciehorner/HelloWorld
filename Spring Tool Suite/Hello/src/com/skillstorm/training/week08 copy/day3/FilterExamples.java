package com.skillstorm.training.week08.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Filter has to take a Predicate lambda
// 	Predicate - Is a function that takes in one value and returns a boolean

public class FilterExamples {
	public static void main(String[] args) {
		Arrays.asList(1, 20, 30, 599, 43, 20, 8, 0).stream().filter(x -> x > 10).forEach(System.out::println);

		// Filter strings use the method reference
		List<House> houses = Arrays.asList(new House("Yellow", 1900),
				new House("Red", 1400),
				new House("White", 55_000),
				new House("Blue", 1900),
				new House("Brown", 1900));
		// How can I use a method reference to filter on if the house is large?
		//houses = houses.stream().filter(house -> house.sqrFt > 2000).collect(Collectors.toList());
		houses = houses.stream().filter(House::isLarge).collect(Collectors.toList());
		System.out.println(houses);
		
	}
}
class House {
	String color;
	int sqrFt;

	public House(String color, int sqrFt) {
		this.color = color;
		this.sqrFt = sqrFt;
	}

	public String toString() {
		return color + " house with " + sqrFt + " sqrFt";
	}
	public boolean isLarge() {
		return sqrFt > 2000;
	}
}