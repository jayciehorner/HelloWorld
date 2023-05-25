package com.skillstorm.training.week08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsingStreams {
	public static void main(String[] args) {
		// Example 1: Creating a stream
		// TOTO put a screenshot in the chat of the following:
		Stream.of(1, 10, 100).peek(x -> System.out.println(x)).map(x -> x * 2).forEach(x -> System.out.println(x));
		Stream.of(1, 10, 100).peek(x -> System.out.println(x)).map(x -> x * 2);

		// Example 2: Using a stream on a ArrayList
		Stream.of(1, 10, 100).peek(x -> System.out.println(x)).map(x -> x * 2).forEach(System.out::println);
		;

		// Example 3: Filter
		List<String> desserts = Arrays.asList("chocolate chip cookies", "double chocolate brownies", "cheesecake",
				"mint chocolate chip ice cream", "strawberry ice cream", "apple pie", "blueberry muffins");
		desserts.stream().filter(dessert -> dessert.contains("chocolate")).forEach(System.out::println);
		System.out.println(desserts); // does not change arrayList because streams to not store data, only process

		String s = "hello";
		s = s.toUpperCase().replace("H", "m");
		System.out.println(s);

		// reduce
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		Integer sum = nums.stream().peek(System.out::println).reduce(0, (x, y) -> {
			System.out.println("x = " + x + " y= " + y);
			return x + y;
		});
		System.out.println(sum);

		// map
		List<House> houses = Arrays.asList(new House("Yellow", 1900), new House("Red", 2400), new House("White", 1300));
// find the one with the largest square footage
		int lgst = houses.stream().peek(System.out::println).map(house -> house.sqrFt).peek(System.out::println)
				.reduce(0, (x, y) ->{System.out.println("comparing " + x + " and " + y); return Math.max(x, y);});
		System.out.println(lgst);

		// map to find the cutest pet
		List<Pet> pets = Arrays.asList(new Pet("Stevie the Cat", 10), new Pet("Taco the Corn Snake", 5), new Pet("Mosely the Raccoon", 8), new Pet("Polly the Parrot", 3), 
				new Pet("Harold the Hound Dog", 2), new Pet("Kermit the Frog", 4), new Pet("Moose the Fish", 6), new Pet("Duck the Blue Bird", 7), new Pet("Kade the Fluffball", 9));
		System.out.println(pets.stream().map(pet -> pet.cuteness).reduce(0, (x, y) -> Math.max(x, y)));
		
		
		
		
		
		
		
		// TODO: Pets Challenge
		
		
		List<Person> people = Arrays.asList( new Person ("Sarah", Arrays.asList(pets.get(4), pets.get(7), pets.get(6))),
				new Person("Clay", Arrays.asList(pets.get(1))),
				new Person("Tyler", Arrays.asList(pets.get(0), pets.get(8), pets.get(4), pets.get(5), pets.get(3))));
		System.out.println(people);
		
		System.out.println(people.stream().map(person -> person.pets.size()).reduce(0, (x, y) -> Math.max(x, y)));
		System.out.println(people.stream().reduce(new Person("", Arrays.asList()), (p1, p2) -> {
			if (p1.pets.size() > p2.pets.size())
				return p1;
			else
				return p2;
		}));
		
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
}
class Pet{
	String name; 
	int cuteness;
	public Pet(String name, int cuteness) {
		super();
		this.name = name;
		this.cuteness = cuteness;
	}
	public String toString() {
		return name;
	}
}

// TODO write a constructor and toString
// in the main method, create a list of people
// use streams to print out the largest number of pets
// Ex: if someone has 10 pets and someone else has 2 pets, I should print out: 10 pets
class Person{
	String name;
	List<Pet> pets;
	
	public Person(String name, List<Pet> pets) {
		this.name = name;
		this.pets = pets;
	}
	public String toString() {
		return name + " has " + pets;
	}
}