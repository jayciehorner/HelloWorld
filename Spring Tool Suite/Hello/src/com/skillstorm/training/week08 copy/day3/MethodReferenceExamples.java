package com.skillstorm.training.week08.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceExamples {
	public static void main(String[] args) {
		// Example 1: Method Reference to a Static method
		Arrays.asList(1, 2, 3, 4, 5).stream().forEach(System.out::println); // .forEach(x -> System.out.println(x))
		;

		// Example 2: Method reference to a constructor
		// construct a list of pets from a stream of strings
		List<Pet> pets = Stream.of("Boots", "Luna", "Shadow", "Fluffy", "Tiger").map(Pet::new) // .map(x -> new Pet(s))
				.collect(Collectors.toList());
		System.out.println(pets);
		System.out.println("hello".toUpperCase());
		// Example 3: Method reference to an instance method of an arbitrary object
		List<String> hobbies = Stream.of("rock climbing", "wood working", "PC building", "coding", "reading")
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(hobbies);

	}

}

class Pet {
	String name;

	public Pet(String name) {
		this.name = name;
	}

	public String toString() {
		return "pet [name= " + name + "]";
	}
}