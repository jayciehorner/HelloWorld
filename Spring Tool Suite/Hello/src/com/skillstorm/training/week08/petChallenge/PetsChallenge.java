package com.skillstorm.training.week08.petChallenge;

import java.util.Arrays;
import java.util.List;

public class PetsChallenge {
	public static void main(String[] args) {
		// map to find the cutest pet
		List<Pet> pets = Arrays.asList(new Pet("Stevie the Cat", 10), new Pet("Taco the Corn Snake", 5),
				new Pet("Mosely the Raccoon", 8), new Pet("Polly the Parrot", 3), new Pet("Harold the Hound Dog", 2),
				new Pet("Kermit the Frog", 4), new Pet("Moose the Fish", 6), new Pet("Duck the Blue Bird", 7),
				new Pet("Kade the Fluffball", 9));
		System.out.println(pets.stream().map(pet -> pet.cuteness).reduce(0, (x, y) -> Math.max(x, y)));

		// TODO: Pets Challenge

		List<Person> people = Arrays.asList(new Person("Sarah", Arrays.asList(pets.get(4), pets.get(7), pets.get(6))),
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

class Pet {
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
class Person {
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